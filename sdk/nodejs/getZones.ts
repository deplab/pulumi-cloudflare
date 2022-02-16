// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to look up [Zone](https://api.cloudflare.com/#zone-properties) records.
 *
 * ## Example Usage
 *
 * Given you have the following zones in Cloudflare.
 *
 * - example.com
 * - example.net
 * - not-example.com
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Look for a single zone that you know exists using an exact match.
 * // API request will be for zones?name=example.com. Will not match not-example.com
 * // or example.net.
 * const example = pulumi.output(cloudflare.getZones({
 *     filter: {
 *         name: "example.com",
 *     },
 * }));
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Look for all zones which include "example".
 * // API request will be for zones?name=contains:example. Will return all three
 * // zones.
 * const example = pulumi.output(cloudflare.getZones({
 *     filter: {
 *         lookupType: "contains",
 *         name: "example",
 *     },
 * }));
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Look for all zones which include "example" but start with "not-".
 * // API request will be for zones?name=contains:example. Will perform client side
 * // filtering using the provided regex and will only match the single zone,
 * // not-example.com.
 * const example = pulumi.output(cloudflare.getZones({
 *     filter: {
 *         lookupType: "contains",
 *         match: "^not-",
 *         name: "example",
 *     },
 * }));
 * ```
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Look for all active zones in an account
 * const example = pulumi.output(cloudflare.getZones({
 *     filter: {
 *         accountId: "1d5fdc9e88c8a8c4518b068cd94331fe",
 *         status: "active",
 *     },
 * }));
 * ```
 */
export function getZones(args: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("cloudflare:index/getZones:getZones", {
        "filter": args.filter,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    /**
     * One or more values used to look up zone records. If more than one value is given all
     * values must match in order to be included, see below for full list.
     */
    filter: inputs.GetZonesFilter;
}

/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    readonly filter: outputs.GetZonesFilter;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of zone objects. Object format:
     */
    readonly zones: outputs.GetZonesZone[];
}

export function getZonesOutput(args: GetZonesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetZonesResult> {
    return pulumi.output(args).apply(a => getZones(a, opts))
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesOutputArgs {
    /**
     * One or more values used to look up zone records. If more than one value is given all
     * values must match in order to be included, see below for full list.
     */
    filter: pulumi.Input<inputs.GetZonesFilterArgs>;
}
