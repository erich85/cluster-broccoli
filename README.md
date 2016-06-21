# Cluster Broccoli

## Description

Cluster Broccoli is a RESTful web service + UI to manage [Nomad](https://www.nomadproject.io) jobs through a self service application. Jobs are defined based on templates, allowing for a selectable amount of customization.

If you want to give your end users the possibility to create new instances of live demos of your product, while allowing them to customize it (e.g. using an embedded database or an external one, number of cores, ...) - Cluster Broccoli is for you.

Cluster Broccoli is meant to be setup by your IT. Some technical knowledge is required to setup the infrastructure and define the templates. End users can be internal (QA, data scientists) or external (customers, potential customers).

## Installation

### Requirements

#### Minimal Setup

- Nomad (REST API v1)
- Java (for running the Play application)

#### Recommended Setup

- Nomad (REST API v1)
- Consul (REST API v1)
- Cluster Broccoli Nomad Job + Docker Image (for running the Play application)

### Building from Source

1. Download or clone the source code
2. Navigate into the project directory
3. `activator dist`

## Configuration

In order to configure Cluster Broccoli, you can add key value pairs to your [application.conf](https://www.playframework.com/documentation/2.4.x/Configuration).
The following configuration properties are supported.

| Property | Description | Default |
| -------- | ----------- | ------- |
| `broccoli.nomad.url` | Address of your nomad server | `http://localhost:4646` |
| `broccoli.consul.url` | Address of your consul server | `http://localhost:8500` |
