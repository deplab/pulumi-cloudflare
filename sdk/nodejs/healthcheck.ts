// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Standalone Health Checks provide a way to monitor origin servers without needing a Cloudflare Load Balancer.
 *
 * ## Example Usage
 *
 * The resource supports HTTP, HTTPS and TCP type health checks.
 * ### HTTPS Health Check
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const httpHealthCheck = new cloudflare.Healthcheck("httpHealthCheck", {
 *     zoneId: _var.cloudflare_zone_id,
 *     name: "http-health-check",
 *     description: "example http health check",
 *     address: "example.com",
 *     suspended: false,
 *     checkRegions: [
 *         "WEU",
 *         "EEU",
 *     ],
 *     notificationSuspended: false,
 *     notificationEmailAddresses: ["hostmaster@example.com"],
 *     type: "HTTPS",
 *     port: "443",
 *     method: "GET",
 *     path: "/health",
 *     expectedBody: "alive",
 *     expectedCodes: [
 *         "2xx",
 *         "301",
 *     ],
 *     followRedirects: true,
 *     allowInsecure: false,
 *     headers: [{
 *         header: "Host",
 *         values: ["example.com"],
 *     }],
 *     timeout: 10,
 *     retries: 2,
 *     interval: 60,
 *     consecutiveFails: 3,
 *     consecutiveSuccesses: 2,
 * });
 * ```
 * ### TCP Monitor
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const tcpHealthCheck = new cloudflare.Healthcheck("tcpHealthCheck", {
 *     zoneId: _var.cloudflare_zone_id,
 *     name: "tcp-health-check",
 *     description: "example tcp health check",
 *     address: "example.com",
 *     suspended: false,
 *     checkRegions: [
 *         "WEU",
 *         "EEU",
 *     ],
 *     notificationSuspended: false,
 *     notificationEmailAddresses: ["hostmaster@example.com"],
 *     type: "TCP",
 *     port: "22",
 *     method: "connection_established",
 *     timeout: 10,
 *     retries: 2,
 *     interval: 60,
 *     consecutiveFails: 3,
 *     consecutiveSuccesses: 2,
 * });
 * ```
 */
export class Healthcheck extends pulumi.CustomResource {
    /**
     * Get an existing Healthcheck resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HealthcheckState, opts?: pulumi.CustomResourceOptions): Healthcheck {
        return new Healthcheck(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/healthcheck:Healthcheck';

    /**
     * Returns true if the given object is an instance of Healthcheck.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Healthcheck {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Healthcheck.__pulumiType;
    }

    /**
     * The hostname or IP address of the origin server to run health checks on.
     */
    public readonly address!: pulumi.Output<string>;
    /**
     * Do not validate the certificate when the health check uses HTTPS. Valid values: `true` or `false` (Default: `false`).
     */
    public readonly allowInsecure!: pulumi.Output<boolean | undefined>;
    /**
     * A list of regions from which to run health checks. If not set Cloudflare will pick a default region. Valid values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
     */
    public readonly checkRegions!: pulumi.Output<string[]>;
    /**
     * The number of consecutive fails required from a health check before changing the health to unhealthy. (Default: `1`)
     */
    public readonly consecutiveFails!: pulumi.Output<number | undefined>;
    /**
     * The number of consecutive successes required from a health check before changing the health to healthy. (Default: `1`)
     */
    public readonly consecutiveSuccesses!: pulumi.Output<number | undefined>;
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * A human-readable description of the health check.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy.
     */
    public readonly expectedBody!: pulumi.Output<string | undefined>;
    /**
     * The expected HTTP response codes (e.g. "200") or code ranges (e.g. "2xx" for all codes starting with 2) of the health check. (Default: `["200"]`)
     */
    public readonly expectedCodes!: pulumi.Output<string[] | undefined>;
    /**
     * Follow redirects if the origin returns a 3xx status code. Valid values: `true` or `false` (Default: `false`).
     */
    public readonly followRedirects!: pulumi.Output<boolean | undefined>;
    /**
     * The header name.
     */
    public readonly headers!: pulumi.Output<outputs.HealthcheckHeader[] | undefined>;
    /**
     * The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations. (Default: `60`)
     */
    public readonly interval!: pulumi.Output<number | undefined>;
    /**
     * The TCP connection method to use for the health check. Valid values: `connectionEstablished` (Default: `connectionEstablished`).
     */
    public readonly method!: pulumi.Output<string>;
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    /**
     * A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A list of email addresses we want to send the notifications to.
     */
    public readonly notificationEmailAddresses!: pulumi.Output<string[] | undefined>;
    /**
     * Whether the notifications are suspended or not. Useful for maintenance periods. Valid values: `true` or `false` (Default: `false`).
     */
    public readonly notificationSuspended!: pulumi.Output<boolean | undefined>;
    /**
     * The endpoint path to health check against. (Default: `/`)
     */
    public readonly path!: pulumi.Output<string | undefined>;
    /**
     * Port number to connect to for the health check.  Valid values are in the range `0-65535` (Default: `80`).
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. (Default: `2`)
     */
    public readonly retries!: pulumi.Output<number | undefined>;
    /**
     * If suspended, no health checks are sent to the origin. Valid values: `true` or `false` (Default: `false`).
     */
    public readonly suspended!: pulumi.Output<boolean | undefined>;
    /**
     * The timeout (in seconds) before marking the health check as failed. (Default: `5`)
     */
    public readonly timeout!: pulumi.Output<number | undefined>;
    /**
     * The protocol to use for the health check. Valid values: `HTTP`, `HTTPS`, `TCP`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The DNS zone ID to which apply settings.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Healthcheck resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HealthcheckArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HealthcheckArgs | HealthcheckState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HealthcheckState | undefined;
            inputs["address"] = state ? state.address : undefined;
            inputs["allowInsecure"] = state ? state.allowInsecure : undefined;
            inputs["checkRegions"] = state ? state.checkRegions : undefined;
            inputs["consecutiveFails"] = state ? state.consecutiveFails : undefined;
            inputs["consecutiveSuccesses"] = state ? state.consecutiveSuccesses : undefined;
            inputs["createdOn"] = state ? state.createdOn : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["expectedBody"] = state ? state.expectedBody : undefined;
            inputs["expectedCodes"] = state ? state.expectedCodes : undefined;
            inputs["followRedirects"] = state ? state.followRedirects : undefined;
            inputs["headers"] = state ? state.headers : undefined;
            inputs["interval"] = state ? state.interval : undefined;
            inputs["method"] = state ? state.method : undefined;
            inputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["notificationEmailAddresses"] = state ? state.notificationEmailAddresses : undefined;
            inputs["notificationSuspended"] = state ? state.notificationSuspended : undefined;
            inputs["path"] = state ? state.path : undefined;
            inputs["port"] = state ? state.port : undefined;
            inputs["retries"] = state ? state.retries : undefined;
            inputs["suspended"] = state ? state.suspended : undefined;
            inputs["timeout"] = state ? state.timeout : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as HealthcheckArgs | undefined;
            if ((!args || args.address === undefined) && !opts.urn) {
                throw new Error("Missing required property 'address'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            inputs["address"] = args ? args.address : undefined;
            inputs["allowInsecure"] = args ? args.allowInsecure : undefined;
            inputs["checkRegions"] = args ? args.checkRegions : undefined;
            inputs["consecutiveFails"] = args ? args.consecutiveFails : undefined;
            inputs["consecutiveSuccesses"] = args ? args.consecutiveSuccesses : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["expectedBody"] = args ? args.expectedBody : undefined;
            inputs["expectedCodes"] = args ? args.expectedCodes : undefined;
            inputs["followRedirects"] = args ? args.followRedirects : undefined;
            inputs["headers"] = args ? args.headers : undefined;
            inputs["interval"] = args ? args.interval : undefined;
            inputs["method"] = args ? args.method : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["notificationEmailAddresses"] = args ? args.notificationEmailAddresses : undefined;
            inputs["notificationSuspended"] = args ? args.notificationSuspended : undefined;
            inputs["path"] = args ? args.path : undefined;
            inputs["port"] = args ? args.port : undefined;
            inputs["retries"] = args ? args.retries : undefined;
            inputs["suspended"] = args ? args.suspended : undefined;
            inputs["timeout"] = args ? args.timeout : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
            inputs["createdOn"] = undefined /*out*/;
            inputs["modifiedOn"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Healthcheck.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Healthcheck resources.
 */
export interface HealthcheckState {
    /**
     * The hostname or IP address of the origin server to run health checks on.
     */
    address?: pulumi.Input<string>;
    /**
     * Do not validate the certificate when the health check uses HTTPS. Valid values: `true` or `false` (Default: `false`).
     */
    allowInsecure?: pulumi.Input<boolean>;
    /**
     * A list of regions from which to run health checks. If not set Cloudflare will pick a default region. Valid values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
     */
    checkRegions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The number of consecutive fails required from a health check before changing the health to unhealthy. (Default: `1`)
     */
    consecutiveFails?: pulumi.Input<number>;
    /**
     * The number of consecutive successes required from a health check before changing the health to healthy. (Default: `1`)
     */
    consecutiveSuccesses?: pulumi.Input<number>;
    createdOn?: pulumi.Input<string>;
    /**
     * A human-readable description of the health check.
     */
    description?: pulumi.Input<string>;
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy.
     */
    expectedBody?: pulumi.Input<string>;
    /**
     * The expected HTTP response codes (e.g. "200") or code ranges (e.g. "2xx" for all codes starting with 2) of the health check. (Default: `["200"]`)
     */
    expectedCodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Follow redirects if the origin returns a 3xx status code. Valid values: `true` or `false` (Default: `false`).
     */
    followRedirects?: pulumi.Input<boolean>;
    /**
     * The header name.
     */
    headers?: pulumi.Input<pulumi.Input<inputs.HealthcheckHeader>[]>;
    /**
     * The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations. (Default: `60`)
     */
    interval?: pulumi.Input<number>;
    /**
     * The TCP connection method to use for the health check. Valid values: `connectionEstablished` (Default: `connectionEstablished`).
     */
    method?: pulumi.Input<string>;
    modifiedOn?: pulumi.Input<string>;
    /**
     * A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
     */
    name?: pulumi.Input<string>;
    /**
     * A list of email addresses we want to send the notifications to.
     */
    notificationEmailAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether the notifications are suspended or not. Useful for maintenance periods. Valid values: `true` or `false` (Default: `false`).
     */
    notificationSuspended?: pulumi.Input<boolean>;
    /**
     * The endpoint path to health check against. (Default: `/`)
     */
    path?: pulumi.Input<string>;
    /**
     * Port number to connect to for the health check.  Valid values are in the range `0-65535` (Default: `80`).
     */
    port?: pulumi.Input<number>;
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. (Default: `2`)
     */
    retries?: pulumi.Input<number>;
    /**
     * If suspended, no health checks are sent to the origin. Valid values: `true` or `false` (Default: `false`).
     */
    suspended?: pulumi.Input<boolean>;
    /**
     * The timeout (in seconds) before marking the health check as failed. (Default: `5`)
     */
    timeout?: pulumi.Input<number>;
    /**
     * The protocol to use for the health check. Valid values: `HTTP`, `HTTPS`, `TCP`.
     */
    type?: pulumi.Input<string>;
    /**
     * The DNS zone ID to which apply settings.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Healthcheck resource.
 */
export interface HealthcheckArgs {
    /**
     * The hostname or IP address of the origin server to run health checks on.
     */
    address: pulumi.Input<string>;
    /**
     * Do not validate the certificate when the health check uses HTTPS. Valid values: `true` or `false` (Default: `false`).
     */
    allowInsecure?: pulumi.Input<boolean>;
    /**
     * A list of regions from which to run health checks. If not set Cloudflare will pick a default region. Valid values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
     */
    checkRegions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The number of consecutive fails required from a health check before changing the health to unhealthy. (Default: `1`)
     */
    consecutiveFails?: pulumi.Input<number>;
    /**
     * The number of consecutive successes required from a health check before changing the health to healthy. (Default: `1`)
     */
    consecutiveSuccesses?: pulumi.Input<number>;
    /**
     * A human-readable description of the health check.
     */
    description?: pulumi.Input<string>;
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy.
     */
    expectedBody?: pulumi.Input<string>;
    /**
     * The expected HTTP response codes (e.g. "200") or code ranges (e.g. "2xx" for all codes starting with 2) of the health check. (Default: `["200"]`)
     */
    expectedCodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Follow redirects if the origin returns a 3xx status code. Valid values: `true` or `false` (Default: `false`).
     */
    followRedirects?: pulumi.Input<boolean>;
    /**
     * The header name.
     */
    headers?: pulumi.Input<pulumi.Input<inputs.HealthcheckHeader>[]>;
    /**
     * The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase load on the origin as we check from multiple locations. (Default: `60`)
     */
    interval?: pulumi.Input<number>;
    /**
     * The TCP connection method to use for the health check. Valid values: `connectionEstablished` (Default: `connectionEstablished`).
     */
    method?: pulumi.Input<string>;
    /**
     * A short name to identify the health check. Only alphanumeric characters, hyphens and underscores are allowed.
     */
    name: pulumi.Input<string>;
    /**
     * A list of email addresses we want to send the notifications to.
     */
    notificationEmailAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether the notifications are suspended or not. Useful for maintenance periods. Valid values: `true` or `false` (Default: `false`).
     */
    notificationSuspended?: pulumi.Input<boolean>;
    /**
     * The endpoint path to health check against. (Default: `/`)
     */
    path?: pulumi.Input<string>;
    /**
     * Port number to connect to for the health check.  Valid values are in the range `0-65535` (Default: `80`).
     */
    port?: pulumi.Input<number>;
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. (Default: `2`)
     */
    retries?: pulumi.Input<number>;
    /**
     * If suspended, no health checks are sent to the origin. Valid values: `true` or `false` (Default: `false`).
     */
    suspended?: pulumi.Input<boolean>;
    /**
     * The timeout (in seconds) before marking the health check as failed. (Default: `5`)
     */
    timeout?: pulumi.Input<number>;
    /**
     * The protocol to use for the health check. Valid values: `HTTP`, `HTTPS`, `TCP`.
     */
    type: pulumi.Input<string>;
    /**
     * The DNS zone ID to which apply settings.
     */
    zoneId: pulumi.Input<string>;
}
