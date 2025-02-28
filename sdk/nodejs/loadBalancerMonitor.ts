// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * If Cloudflare's Load Balancing to load-balance across multiple
 * origin servers or data centers, you configure one of these Monitors
 * to actively check the availability of those servers over HTTP(S) or
 * TCP.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // TCP Monitor
 * const example = new cloudflare.LoadBalancerMonitor("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     description: "example tcp load balancer",
 *     interval: 60,
 *     method: "connection_established",
 *     port: 8080,
 *     retries: 5,
 *     timeout: 7,
 *     type: "tcp",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor example <account_id>/<load_balancer_monitor_id>
 * ```
 */
export class LoadBalancerMonitor extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancerMonitor resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerMonitorState, opts?: pulumi.CustomResourceOptions): LoadBalancerMonitor {
        return new LoadBalancerMonitor(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor';

    /**
     * Returns true if the given object is an instance of LoadBalancerMonitor.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancerMonitor {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancerMonitor.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is "http" or "https".
     */
    public readonly allowInsecure!: pulumi.Output<boolean | undefined>;
    /**
     * To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times. Defaults to `0`.
     */
    public readonly consecutiveDown!: pulumi.Output<number | undefined>;
    /**
     * To be marked healthy the monitored origin must pass this healthcheck N consecutive times. Defaults to `0`.
     */
    public readonly consecutiveUp!: pulumi.Output<number | undefined>;
    /**
     * The RFC3339 timestamp of when the load balancer monitor was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * Free text description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https".
     */
    public readonly expectedBody!: pulumi.Output<string | undefined>;
    /**
     * The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
     */
    public readonly expectedCodes!: pulumi.Output<string | undefined>;
    /**
     * Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
     */
    public readonly followRedirects!: pulumi.Output<boolean | undefined>;
    /**
     * The header name.
     */
    public readonly headers!: pulumi.Output<outputs.LoadBalancerMonitorHeader[] | undefined>;
    /**
     * The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
     */
    public readonly interval!: pulumi.Output<number | undefined>;
    /**
     * The method to use for the health check.
     */
    public readonly method!: pulumi.Output<string>;
    /**
     * The RFC3339 timestamp of when the load balancer monitor was last modified.
     */
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    /**
     * The endpoint path to health check against.
     */
    public readonly path!: pulumi.Output<string>;
    /**
     * The port number to use for the healthcheck, required when creating a TCP monitor.
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * Assign this monitor to emulate the specified zone while probing. Only valid if `type` is "http" or "https".
     */
    public readonly probeZone!: pulumi.Output<string | undefined>;
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
     */
    public readonly retries!: pulumi.Output<number | undefined>;
    /**
     * The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
     */
    public readonly timeout!: pulumi.Output<number | undefined>;
    /**
     * The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udpIcmp`, `icmpPing`, `smtp`. Defaults to `http`.
     */
    public readonly type!: pulumi.Output<string | undefined>;

    /**
     * Create a LoadBalancerMonitor resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerMonitorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerMonitorArgs | LoadBalancerMonitorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadBalancerMonitorState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["allowInsecure"] = state ? state.allowInsecure : undefined;
            resourceInputs["consecutiveDown"] = state ? state.consecutiveDown : undefined;
            resourceInputs["consecutiveUp"] = state ? state.consecutiveUp : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["expectedBody"] = state ? state.expectedBody : undefined;
            resourceInputs["expectedCodes"] = state ? state.expectedCodes : undefined;
            resourceInputs["followRedirects"] = state ? state.followRedirects : undefined;
            resourceInputs["headers"] = state ? state.headers : undefined;
            resourceInputs["interval"] = state ? state.interval : undefined;
            resourceInputs["method"] = state ? state.method : undefined;
            resourceInputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["probeZone"] = state ? state.probeZone : undefined;
            resourceInputs["retries"] = state ? state.retries : undefined;
            resourceInputs["timeout"] = state ? state.timeout : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as LoadBalancerMonitorArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["allowInsecure"] = args ? args.allowInsecure : undefined;
            resourceInputs["consecutiveDown"] = args ? args.consecutiveDown : undefined;
            resourceInputs["consecutiveUp"] = args ? args.consecutiveUp : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["expectedBody"] = args ? args.expectedBody : undefined;
            resourceInputs["expectedCodes"] = args ? args.expectedCodes : undefined;
            resourceInputs["followRedirects"] = args ? args.followRedirects : undefined;
            resourceInputs["headers"] = args ? args.headers : undefined;
            resourceInputs["interval"] = args ? args.interval : undefined;
            resourceInputs["method"] = args ? args.method : undefined;
            resourceInputs["path"] = args ? args.path : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["probeZone"] = args ? args.probeZone : undefined;
            resourceInputs["retries"] = args ? args.retries : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["createdOn"] = undefined /*out*/;
            resourceInputs["modifiedOn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadBalancerMonitor.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancerMonitor resources.
 */
export interface LoadBalancerMonitorState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is "http" or "https".
     */
    allowInsecure?: pulumi.Input<boolean>;
    /**
     * To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times. Defaults to `0`.
     */
    consecutiveDown?: pulumi.Input<number>;
    /**
     * To be marked healthy the monitored origin must pass this healthcheck N consecutive times. Defaults to `0`.
     */
    consecutiveUp?: pulumi.Input<number>;
    /**
     * The RFC3339 timestamp of when the load balancer monitor was created.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * Free text description.
     */
    description?: pulumi.Input<string>;
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https".
     */
    expectedBody?: pulumi.Input<string>;
    /**
     * The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
     */
    expectedCodes?: pulumi.Input<string>;
    /**
     * Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
     */
    followRedirects?: pulumi.Input<boolean>;
    /**
     * The header name.
     */
    headers?: pulumi.Input<pulumi.Input<inputs.LoadBalancerMonitorHeader>[]>;
    /**
     * The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
     */
    interval?: pulumi.Input<number>;
    /**
     * The method to use for the health check.
     */
    method?: pulumi.Input<string>;
    /**
     * The RFC3339 timestamp of when the load balancer monitor was last modified.
     */
    modifiedOn?: pulumi.Input<string>;
    /**
     * The endpoint path to health check against.
     */
    path?: pulumi.Input<string>;
    /**
     * The port number to use for the healthcheck, required when creating a TCP monitor.
     */
    port?: pulumi.Input<number>;
    /**
     * Assign this monitor to emulate the specified zone while probing. Only valid if `type` is "http" or "https".
     */
    probeZone?: pulumi.Input<string>;
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
     */
    retries?: pulumi.Input<number>;
    /**
     * The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
     */
    timeout?: pulumi.Input<number>;
    /**
     * The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udpIcmp`, `icmpPing`, `smtp`. Defaults to `http`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LoadBalancerMonitor resource.
 */
export interface LoadBalancerMonitorArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is "http" or "https".
     */
    allowInsecure?: pulumi.Input<boolean>;
    /**
     * To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times. Defaults to `0`.
     */
    consecutiveDown?: pulumi.Input<number>;
    /**
     * To be marked healthy the monitored origin must pass this healthcheck N consecutive times. Defaults to `0`.
     */
    consecutiveUp?: pulumi.Input<number>;
    /**
     * Free text description.
     */
    description?: pulumi.Input<string>;
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https".
     */
    expectedBody?: pulumi.Input<string>;
    /**
     * The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
     */
    expectedCodes?: pulumi.Input<string>;
    /**
     * Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
     */
    followRedirects?: pulumi.Input<boolean>;
    /**
     * The header name.
     */
    headers?: pulumi.Input<pulumi.Input<inputs.LoadBalancerMonitorHeader>[]>;
    /**
     * The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
     */
    interval?: pulumi.Input<number>;
    /**
     * The method to use for the health check.
     */
    method?: pulumi.Input<string>;
    /**
     * The endpoint path to health check against.
     */
    path?: pulumi.Input<string>;
    /**
     * The port number to use for the healthcheck, required when creating a TCP monitor.
     */
    port?: pulumi.Input<number>;
    /**
     * Assign this monitor to emulate the specified zone while probing. Only valid if `type` is "http" or "https".
     */
    probeZone?: pulumi.Input<string>;
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
     */
    retries?: pulumi.Input<number>;
    /**
     * The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
     */
    timeout?: pulumi.Input<number>;
    /**
     * The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udpIcmp`, `icmpPing`, `smtp`. Defaults to `http`.
     */
    type?: pulumi.Input<string>;
}
