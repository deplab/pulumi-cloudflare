// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * IP Lists are a set of IP addresses or CIDR ranges that are configured on the account level. Once created, IP Lists can be
 * used in Firewall Rules across all zones within the same account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.IpList("example", {
 *     accountId: "d41d8cd98f00b204e9800998ecf8427e",
 *     description: "list description",
 *     items: [
 *         {
 *             comment: "Office IP",
 *             value: "192.0.2.1",
 *         },
 *         {
 *             comment: "Datacenter range",
 *             value: "203.0.113.0/24",
 *         },
 *     ],
 *     kind: "ip",
 *     name: "example_list",
 * });
 * ```
 *
 * ## Import
 *
 * An existing IP List can be imported using the account ID and list ID
 *
 * ```sh
 *  $ pulumi import cloudflare:index/ipList:IpList example d41d8cd98f00b204e9800998ecf8427e/cb029e245cfdd66dc8d2e570d5dd3322
 * ```
 */
export class IpList extends pulumi.CustomResource {
    /**
     * Get an existing IpList resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IpListState, opts?: pulumi.CustomResourceOptions): IpList {
        return new IpList(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/ipList:IpList';

    /**
     * Returns true if the given object is an instance of IpList.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IpList {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IpList.__pulumiType;
    }

    /**
     * The ID of the account where the IP List is being created.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * A note that can be used to annotate the List. Maximum Length: 500
     */
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly items!: pulumi.Output<outputs.IpListItem[] | undefined>;
    /**
     * The kind of values in the List. Valid values: `ip`.
     */
    public readonly kind!: pulumi.Output<string>;
    /**
     * The name of the list (used in filter expressions). Valid pattern: `^[a-zA-Z0-9_]+$`. Maximum Length: 50
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a IpList resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IpListArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IpListArgs | IpListState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IpListState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["items"] = state ? state.items : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as IpListArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.kind === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kind'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["items"] = args ? args.items : undefined;
            resourceInputs["kind"] = args ? args.kind : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IpList.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IpList resources.
 */
export interface IpListState {
    /**
     * The ID of the account where the IP List is being created.
     */
    accountId?: pulumi.Input<string>;
    /**
     * A note that can be used to annotate the List. Maximum Length: 500
     */
    description?: pulumi.Input<string>;
    items?: pulumi.Input<pulumi.Input<inputs.IpListItem>[]>;
    /**
     * The kind of values in the List. Valid values: `ip`.
     */
    kind?: pulumi.Input<string>;
    /**
     * The name of the list (used in filter expressions). Valid pattern: `^[a-zA-Z0-9_]+$`. Maximum Length: 50
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IpList resource.
 */
export interface IpListArgs {
    /**
     * The ID of the account where the IP List is being created.
     */
    accountId: pulumi.Input<string>;
    /**
     * A note that can be used to annotate the List. Maximum Length: 500
     */
    description?: pulumi.Input<string>;
    items?: pulumi.Input<pulumi.Input<inputs.IpListItem>[]>;
    /**
     * The kind of values in the List. Valid values: `ip`.
     */
    kind: pulumi.Input<string>;
    /**
     * The name of the list (used in filter expressions). Valid pattern: `^[a-zA-Z0-9_]+$`. Maximum Length: 50
     */
    name: pulumi.Input<string>;
}
