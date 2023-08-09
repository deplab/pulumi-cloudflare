// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Cache Reserve resource. Cache Reserve can
 * increase cache lifetimes by automatically storing all cacheable
 * files in Cloudflare's persistent object storage buckets.
 *
 * Note: Using Cache Reserve without Tiered Cache is not recommended.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.ZoneCacheReserve("example", {
 *     enabled: true,
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/zoneCacheReserve:ZoneCacheReserve example <zone_id>
 * ```
 */
export class ZoneCacheReserve extends pulumi.CustomResource {
    /**
     * Get an existing ZoneCacheReserve resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZoneCacheReserveState, opts?: pulumi.CustomResourceOptions): ZoneCacheReserve {
        return new ZoneCacheReserve(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zoneCacheReserve:ZoneCacheReserve';

    /**
     * Returns true if the given object is an instance of ZoneCacheReserve.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZoneCacheReserve {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZoneCacheReserve.__pulumiType;
    }

    /**
     * Whether to enable or disable Cache Reserve support for a given zone.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ZoneCacheReserve resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZoneCacheReserveArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZoneCacheReserveArgs | ZoneCacheReserveState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZoneCacheReserveState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ZoneCacheReserveArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ZoneCacheReserve.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZoneCacheReserve resources.
 */
export interface ZoneCacheReserveState {
    /**
     * Whether to enable or disable Cache Reserve support for a given zone.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZoneCacheReserve resource.
 */
export interface ZoneCacheReserveArgs {
    /**
     * Whether to enable or disable Cache Reserve support for a given zone.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
