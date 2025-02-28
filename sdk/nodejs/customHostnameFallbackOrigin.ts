// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare custom hostname fallback origin resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.CustomHostnameFallbackOrigin("example", {
 *     origin: "fallback.example.com",
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin example <zone_id>/<fallback_hostname>
 * ```
 */
export class CustomHostnameFallbackOrigin extends pulumi.CustomResource {
    /**
     * Get an existing CustomHostnameFallbackOrigin resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomHostnameFallbackOriginState, opts?: pulumi.CustomResourceOptions): CustomHostnameFallbackOrigin {
        return new CustomHostnameFallbackOrigin(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin';

    /**
     * Returns true if the given object is an instance of CustomHostnameFallbackOrigin.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomHostnameFallbackOrigin {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomHostnameFallbackOrigin.__pulumiType;
    }

    /**
     * Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
     */
    public readonly origin!: pulumi.Output<string>;
    /**
     * Status of the fallback origin's activation.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a CustomHostnameFallbackOrigin resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomHostnameFallbackOriginArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomHostnameFallbackOriginArgs | CustomHostnameFallbackOriginState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomHostnameFallbackOriginState | undefined;
            resourceInputs["origin"] = state ? state.origin : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as CustomHostnameFallbackOriginArgs | undefined;
            if ((!args || args.origin === undefined) && !opts.urn) {
                throw new Error("Missing required property 'origin'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["origin"] = args ? args.origin : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomHostnameFallbackOrigin.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomHostnameFallbackOrigin resources.
 */
export interface CustomHostnameFallbackOriginState {
    /**
     * Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
     */
    origin?: pulumi.Input<string>;
    /**
     * Status of the fallback origin's activation.
     */
    status?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomHostnameFallbackOrigin resource.
 */
export interface CustomHostnameFallbackOriginArgs {
    /**
     * Hostname you intend to fallback requests to. Origin must be a proxied A/AAAA/CNAME DNS record within Clouldflare.
     */
    origin: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
