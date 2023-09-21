# The Internet Tests

[![Dev code test & PR to staging](https://github.com/jsugg/the-internet-tests/actions/workflows/java-framework-test-and-merge.yml/badge.svg?branch=develop)](https://github.com/jsugg/the-internet-tests/actions/workflows/java-framework-test-and-merge.yml)
![GitHub last commit](https://img.shields.io/github/last-commit/jsugg/the-internet-tests)
![GitHub issues](https://img.shields.io/github/issues/jsugg/the-internet-tests)
![GitHub pull requests](https://img.shields.io/github/issues-pr/jsugg/the-internet-tests)
![License](https://img.shields.io/github/license/jsugg/the-internet-tests)

## Overview

This repository serves as a comprehensive guide and example set for different test automation frameworks. It aims to provide the same test suite across multiple frameworks for educational purposes.

## Features

- Java + TestNG + Selenium
- NodeJS + Jest + Playwright (WIP)

## Directory Structure

- `.github/`: GitHub actions and dependabot configurations
- `java-framework/`: Java + TestNG + Selenium implementation
  - `src/test/java/theinternetwebsite/ui/`: UI tests
  - `src/test/java/theinternetwebsite/ui/pageobjects/`: Page object models
  - `src/test/resources/`: Test resources

## Getting Started

### Prerequisites

- Java 8 or higher

### Installation

1. Clone the repository
```bash
git clone https://github.com/jsugg/the-internet-tests.git
```
2. Navigate to the java-framework directory
```bash
cd the-internet-tests/java-framework
```
3. Install dependencies
```bash
mvn install
```
### Running Tests
Execute the following command to run the tests:

```bash
mvn test
```

## Contributing
Please read [CONTRIBUTING](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE.md) file for details.

## Acknowledgments
[The Internet](https://the-internet.herokuapp.com/) for providing the platform for these tests.
