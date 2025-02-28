// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource to manage a Cloudflare Workers KV Pair.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleNs = new cloudflare.WorkersKvNamespace("exampleNs", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     title: "test-namespace",
 * });
 * const example = new cloudflare.WorkersKv("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     namespaceId: exampleNs.id,
 *     key: "test-key",
 *     value: "test value",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/workersKv:WorkersKv example <account_id>/<namespace_id>/<key_name>
 * ```
 */
export class WorkersKv extends pulumi.CustomResource {
    /**
     * Get an existing WorkersKv resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkersKvState, opts?: pulumi.CustomResourceOptions): WorkersKv {
        return new WorkersKv(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workersKv:WorkersKv';

    /**
     * Returns true if the given object is an instance of WorkersKv.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkersKv {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkersKv.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Name of the KV pair. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly key!: pulumi.Output<string>;
    /**
     * The ID of the Workers KV namespace in which you want to create the KV pair. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly namespaceId!: pulumi.Output<string>;
    /**
     * Value of the KV pair.
     */
    public readonly value!: pulumi.Output<string>;

    /**
     * Create a WorkersKv resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkersKvArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkersKvArgs | WorkersKvState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkersKvState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["namespaceId"] = state ? state.namespaceId : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as WorkersKvArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.key === undefined) && !opts.urn) {
                throw new Error("Missing required property 'key'");
            }
            if ((!args || args.namespaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'namespaceId'");
            }
            if ((!args || args.value === undefined) && !opts.urn) {
                throw new Error("Missing required property 'value'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["key"] = args ? args.key : undefined;
            resourceInputs["namespaceId"] = args ? args.namespaceId : undefined;
            resourceInputs["value"] = args ? args.value : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkersKv.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkersKv resources.
 */
export interface WorkersKvState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Name of the KV pair. **Modifying this attribute will force creation of a new resource.**
     */
    key?: pulumi.Input<string>;
    /**
     * The ID of the Workers KV namespace in which you want to create the KV pair. **Modifying this attribute will force creation of a new resource.**
     */
    namespaceId?: pulumi.Input<string>;
    /**
     * Value of the KV pair.
     */
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkersKv resource.
 */
export interface WorkersKvArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * Name of the KV pair. **Modifying this attribute will force creation of a new resource.**
     */
    key: pulumi.Input<string>;
    /**
     * The ID of the Workers KV namespace in which you want to create the KV pair. **Modifying this attribute will force creation of a new resource.**
     */
    namespaceId: pulumi.Input<string>;
    /**
     * Value of the KV pair.
     */
    value: pulumi.Input<string>;
}
