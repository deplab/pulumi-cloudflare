// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Zone Hold resource that prevents adding
 * the hostname to another account for use.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.ZoneHold("example", {
 *     hold: true,
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/zoneHold:ZoneHold example <zone_id>
 * ```
 */
export class ZoneHold extends pulumi.CustomResource {
    /**
     * Get an existing ZoneHold resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZoneHoldState, opts?: pulumi.CustomResourceOptions): ZoneHold {
        return new ZoneHold(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zoneHold:ZoneHold';

    /**
     * Returns true if the given object is an instance of ZoneHold.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZoneHold {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZoneHold.__pulumiType;
    }

    /**
     * Enablement status of the zone hold.
     */
    public readonly hold!: pulumi.Output<boolean>;
    /**
     * The RFC3339 compatible timestamp when to automatically re-enable the zone hold.
     */
    public readonly holdAfter!: pulumi.Output<string>;
    /**
     * Whether to extend to block any subdomain of the given zone.
     */
    public readonly includeSubdomains!: pulumi.Output<boolean | undefined>;
    /**
     * The zone identifier to target for the resource.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ZoneHold resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZoneHoldArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZoneHoldArgs | ZoneHoldState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZoneHoldState | undefined;
            resourceInputs["hold"] = state ? state.hold : undefined;
            resourceInputs["holdAfter"] = state ? state.holdAfter : undefined;
            resourceInputs["includeSubdomains"] = state ? state.includeSubdomains : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ZoneHoldArgs | undefined;
            if ((!args || args.hold === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hold'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["hold"] = args ? args.hold : undefined;
            resourceInputs["holdAfter"] = args ? args.holdAfter : undefined;
            resourceInputs["includeSubdomains"] = args ? args.includeSubdomains : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ZoneHold.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZoneHold resources.
 */
export interface ZoneHoldState {
    /**
     * Enablement status of the zone hold.
     */
    hold?: pulumi.Input<boolean>;
    /**
     * The RFC3339 compatible timestamp when to automatically re-enable the zone hold.
     */
    holdAfter?: pulumi.Input<string>;
    /**
     * Whether to extend to block any subdomain of the given zone.
     */
    includeSubdomains?: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZoneHold resource.
 */
export interface ZoneHoldArgs {
    /**
     * Enablement status of the zone hold.
     */
    hold: pulumi.Input<boolean>;
    /**
     * The RFC3339 compatible timestamp when to automatically re-enable the zone hold.
     */
    holdAfter?: pulumi.Input<string>;
    /**
     * Whether to extend to block any subdomain of the given zone.
     */
    includeSubdomains?: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId: pulumi.Input<string>;
}
