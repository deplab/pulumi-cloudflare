// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to look up [Zone][1] DNSSEC settings.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getZoneDnssec({
 *     zoneId: "<zone_id>",
 * });
 * ```
 */
export function getZoneDnssec(args: GetZoneDnssecArgs, opts?: pulumi.InvokeOptions): Promise<GetZoneDnssecResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getZoneDnssec:getZoneDnssec", {
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZoneDnssec.
 */
export interface GetZoneDnssecArgs {
    /**
     * The zone id for the zone.
     */
    zoneId: string;
}

/**
 * A collection of values returned by getZoneDnssec.
 */
export interface GetZoneDnssecResult {
    /**
     * Zone DNSSEC algorithm.
     */
    readonly algorithm: string;
    /**
     * Zone DNSSEC digest.
     */
    readonly digest: string;
    /**
     * Digest algorithm use for Zone DNSSEC.
     */
    readonly digestAlgorithm: string;
    /**
     * Digest Type for Zone DNSSEC.
     */
    readonly digestType: string;
    /**
     * DS for the Zone DNSSEC.
     */
    readonly ds: string;
    /**
     * Zone DNSSEC flags.
     */
    readonly flags: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Key Tag for the Zone DNSSEC.
     */
    readonly keyTag: number;
    /**
     * Key type used for Zone DNSSEC.
     */
    readonly keyType: string;
    /**
     * Public Key for the Zone DNSSEC.
     */
    readonly publicKey: string;
    /**
     * The status of the Zone DNSSEC.
     */
    readonly status: string;
    readonly zoneId: string;
}

export function getZoneDnssecOutput(args: GetZoneDnssecOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetZoneDnssecResult> {
    return pulumi.output(args).apply(a => getZoneDnssec(a, opts))
}

/**
 * A collection of arguments for invoking getZoneDnssec.
 */
export interface GetZoneDnssecOutputArgs {
    /**
     * The zone id for the zone.
     */
    zoneId: pulumi.Input<string>;
}
