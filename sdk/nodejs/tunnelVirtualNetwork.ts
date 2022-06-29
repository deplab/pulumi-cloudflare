// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource, that manages Cloudflare tunnel virtual networks for Zero Trust. Tunnel
 * virtual networks are used for segregation of Tunnel IP Routes via Virtualized Networks to
 * handle overlapping private IPs in your origins.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.TunnelVirtualNetwork("example", {
 *     accountId: "c4a7362d577a6c3019a474fd6f485821",
 *     comment: "New tunnel virtual network for documentation",
 *     name: "vnet-for-documentation",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/tunnelVirtualNetwork:TunnelVirtualNetwork cloudflare_tunnel_virtual_network <account_id>/<vnet_id>
 * ```
 */
export class TunnelVirtualNetwork extends pulumi.CustomResource {
    /**
     * Get an existing TunnelVirtualNetwork resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TunnelVirtualNetworkState, opts?: pulumi.CustomResourceOptions): TunnelVirtualNetwork {
        return new TunnelVirtualNetwork(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/tunnelVirtualNetwork:TunnelVirtualNetwork';

    /**
     * Returns true if the given object is an instance of TunnelVirtualNetwork.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TunnelVirtualNetwork {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TunnelVirtualNetwork.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Description of the tunnel virtual network.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Whether this virtual network is the default one for the account. This means IP Routes belong to this virtual network and
     * Teams Clients in the account route through this virtual network, unless specified otherwise for each case.
     */
    public readonly isDefaultNetwork!: pulumi.Output<boolean | undefined>;
    /**
     * A user-friendly name chosen when the virtual network is created.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a TunnelVirtualNetwork resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TunnelVirtualNetworkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TunnelVirtualNetworkArgs | TunnelVirtualNetworkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TunnelVirtualNetworkState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["isDefaultNetwork"] = state ? state.isDefaultNetwork : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as TunnelVirtualNetworkArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["isDefaultNetwork"] = args ? args.isDefaultNetwork : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TunnelVirtualNetwork.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TunnelVirtualNetwork resources.
 */
export interface TunnelVirtualNetworkState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Description of the tunnel virtual network.
     */
    comment?: pulumi.Input<string>;
    /**
     * Whether this virtual network is the default one for the account. This means IP Routes belong to this virtual network and
     * Teams Clients in the account route through this virtual network, unless specified otherwise for each case.
     */
    isDefaultNetwork?: pulumi.Input<boolean>;
    /**
     * A user-friendly name chosen when the virtual network is created.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TunnelVirtualNetwork resource.
 */
export interface TunnelVirtualNetworkArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * Description of the tunnel virtual network.
     */
    comment?: pulumi.Input<string>;
    /**
     * Whether this virtual network is the default one for the account. This means IP Routes belong to this virtual network and
     * Teams Clients in the account route through this virtual network, unless specified otherwise for each case.
     */
    isDefaultNetwork?: pulumi.Input<boolean>;
    /**
     * A user-friendly name chosen when the virtual network is created.
     */
    name: pulumi.Input<string>;
}
