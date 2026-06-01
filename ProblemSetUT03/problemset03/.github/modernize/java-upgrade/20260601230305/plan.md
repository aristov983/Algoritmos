# Upgrade Plan: problemset03 (20260601230305)

- **Generated**: 2026-06-01 23:03:05
- **HEAD Branch**: appmod/java-upgrade-20260601230305
- **HEAD Commit ID**: N/A

## Available Tools

**JDKs**
- JDK 21.0.11: /usr/lib/jvm/java-21-openjdk-amd64/bin (current target/runtime for upgrade verification)

**Build Tools**
- Maven 3.8.7: /usr/share/maven/bin
- Maven Wrapper: absent

## Guidelines

> Note: You can add any specific guidelines or constraints for the upgrade process here if needed, bullet points are preferred.

## Options

- Working branch: appmod/java-upgrade-20260601230305
- Run tests before and after the upgrade: true

## Upgrade Goals

- Upgrade the project runtime to Java 21 (latest LTS)

## Technology Stack

| Technology/Dependency | Current | Min Compatible | Why Incompatible |
| --------------------- | ------- | -------------- | ---------------- |
| Java | 21 | 21 | User requested latest LTS runtime |
| Maven | 3.8.7 | 3.8.7 | Compatible; no wrapper present |
| maven-compiler-plugin | 3.8.0 | 3.11.0 | 3.8.0 predates JDK 21 and may not support `--release 21` cleanly |
| maven-surefire-plugin | 2.22.1 | 3.1.2 | Older surefire versions can fail on modern JDKs due to classloading/module changes |
| JUnit | 4.11 | 4.13.2 | 4.11 is outdated; patch upgrade improves compatibility with newer JVMs |

## Derived Upgrades

- Upgrade `maven-compiler-plugin` to 3.11.0 because current 3.8.0 is too old for safe Java 21 compilation support.
- Upgrade `maven-surefire-plugin` to 3.1.2 because JDK 21 requires a modern Surefire runtime plugin.
- Upgrade `junit:junit` from 4.11 to 4.13.2 to reduce Java 21 compatibility risk and improve test stability.

## Impact Analysis

### Dependency Changes

| File | Dependency | Current | Action | Target | Reason |
|------|------------|---------|--------|--------|--------|
| pom.xml | maven-compiler-plugin | 3.8.0 | upgrade | 3.11.0 | Required for JDK 21 compatibility |
| pom.xml | maven-surefire-plugin | 2.22.1 | upgrade | 3.1.2 | Required for reliable test execution on JDK 21 |
| pom.xml | junit:junit | 4.11 | upgrade | 4.13.2 | Old test dependency; patch upgrade improves runtime compatibility |

### Source Code Changes

No source code changes are required for the Java 21 runtime upgrade.

### Configuration Changes

No `application.properties`/`application.yml` or XML descriptor changes are required.

### CI/CD Changes

No CI/CD files were detected in the project root that require changes for this upgrade.

### Risks & Warnings

- **Plugin compatibility risk**: `maven-compiler-plugin` 3.8.0 and `maven-surefire-plugin` 2.22.1 are both outdated. If not updated, the project may compile or run tests incorrectly on JDK 21.
- **JUnit runtime risk**: JUnit 4.11 is very old and may expose incompatibilities with the modern JVM. Upgrading to 4.13.2 mitigates this risk.
- **Default JDK mismatch**: System Maven currently uses JDK 25 by default. Verification will explicitly use JDK 21 to ensure the project targets the intended LTS runtime.

## Upgrade Steps

- Step 1: Setup Environment
  - **Rationale**: Confirm JDK 21 availability and use a known-good Maven runtime before making build changes.
  - **Changes to Make**: Validate the JDK and Maven toolchain paths; no source changes.
  - **Verification**: `JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64 /usr/share/maven/bin/mvn -version`

- Step 2: Setup Baseline
  - **Rationale**: Capture current build/test behavior before applying plugin upgrades.
  - **Changes to Make**: None; run baseline on existing project configuration.
  - **Verification**: `JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64 /usr/share/maven/bin/mvn clean compile test-compile -q && JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64 /usr/share/maven/bin/mvn clean test -q`

- Step 3: Upgrade Maven plugins and JUnit
  - **Rationale**: Apply the minimal compatibility upgrades required for Java 21 and modern test execution.
  - **Changes to Make**: Update `pom.xml` plugin versions and JUnit version as identified in Impact Analysis.
  - **Verification**: `JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64 /usr/share/maven/bin/mvn clean test-compile -q`

- Step 4: CVE Validation & Fix
  - **Rationale**: Validate direct dependencies for known vulnerabilities and ensure no CVEs remain in upgraded artifacts.
  - **Changes to Make**: Scan direct dependencies and patch any reported CVEs by upgrading compatible versions.
  - **Verification**: `JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64 /usr/share/maven/bin/mvn dependency:list -DexcludeTransitive=true -q`

- Step 5: Final Validation
  - **Rationale**: Confirm the upgraded runtime and build chain produce a clean release-quality result.
  - **Changes to Make**: Resolve any test failures discovered after plugin and dependency upgrades.
  - **Verification**: `JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64 /usr/share/maven/bin/mvn clean test -q`
