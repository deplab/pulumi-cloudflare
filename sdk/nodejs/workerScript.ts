// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `cloudflare.WorkerRoute`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * import * as fs from "fs";
 *
 * const myNamespace = new cloudflare.WorkersKvNamespace("myNamespace", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     title: "example",
 * });
 * // Sets the script with the name "script_1"
 * const myScript = new cloudflare.WorkerScript("myScript", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "script_1",
 *     content: fs.readFileSync("script.js"),
 *     kvNamespaceBindings: [{
 *         name: "MY_EXAMPLE_KV_NAMESPACE",
 *         namespaceId: myNamespace.id,
 *     }],
 *     plainTextBindings: [{
 *         name: "MY_EXAMPLE_PLAIN_TEXT",
 *         text: "foobar",
 *     }],
 *     secretTextBindings: [{
 *         name: "MY_EXAMPLE_SECRET_TEXT",
 *         text: _var.secret_foo_value,
 *     }],
 *     webassemblyBindings: [{
 *         name: "MY_EXAMPLE_WASM",
 *         module: Buffer.from(fs.readFileSync("example.wasm"), 'binary').toString('base64'),
 *     }],
 *     serviceBindings: [{
 *         name: "MY_SERVICE_BINDING",
 *         service: "MY_SERVICE",
 *         environment: "production",
 *     }],
 *     r2BucketBindings: [{
 *         name: "MY_BUCKET",
 *         bucketName: "MY_BUCKET_NAME",
 *     }],
 *     analyticsEngineBindings: [{
 *         name: "MY_DATASET",
 *         dataset: "dataset1",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/workerScript:WorkerScript example <account_id>/<script_name>
 * ```
 */
export class WorkerScript extends pulumi.CustomResource {
    /**
     * Get an existing WorkerScript resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkerScriptState, opts?: pulumi.CustomResourceOptions): WorkerScript {
        return new WorkerScript(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workerScript:WorkerScript';

    /**
     * Returns true if the given object is an instance of WorkerScript.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkerScript {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkerScript.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    public readonly analyticsEngineBindings!: pulumi.Output<outputs.WorkerScriptAnalyticsEngineBinding[] | undefined>;
    /**
     * The date to use for the compatibility flag.
     */
    public readonly compatibilityDate!: pulumi.Output<string | undefined>;
    /**
     * Compatibility flags used for Worker Scripts.
     */
    public readonly compatibilityFlags!: pulumi.Output<string[]>;
    /**
     * The script content.
     */
    public readonly content!: pulumi.Output<string>;
    public readonly kvNamespaceBindings!: pulumi.Output<outputs.WorkerScriptKvNamespaceBinding[] | undefined>;
    /**
     * Enabling allows Worker events to be sent to a defined Logpush destination.
     */
    public readonly logpush!: pulumi.Output<boolean | undefined>;
    /**
     * The base64 encoded wasm module you want to store.
     */
    public readonly module!: pulumi.Output<boolean | undefined>;
    /**
     * The global variable for the binding in your Worker code.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly placements!: pulumi.Output<outputs.WorkerScriptPlacement[] | undefined>;
    public readonly plainTextBindings!: pulumi.Output<outputs.WorkerScriptPlainTextBinding[] | undefined>;
    public readonly queueBindings!: pulumi.Output<outputs.WorkerScriptQueueBinding[] | undefined>;
    public readonly r2BucketBindings!: pulumi.Output<outputs.WorkerScriptR2BucketBinding[] | undefined>;
    public readonly secretTextBindings!: pulumi.Output<outputs.WorkerScriptSecretTextBinding[] | undefined>;
    public readonly serviceBindings!: pulumi.Output<outputs.WorkerScriptServiceBinding[] | undefined>;
    public readonly webassemblyBindings!: pulumi.Output<outputs.WorkerScriptWebassemblyBinding[] | undefined>;

    /**
     * Create a WorkerScript resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkerScriptArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkerScriptArgs | WorkerScriptState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkerScriptState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["analyticsEngineBindings"] = state ? state.analyticsEngineBindings : undefined;
            resourceInputs["compatibilityDate"] = state ? state.compatibilityDate : undefined;
            resourceInputs["compatibilityFlags"] = state ? state.compatibilityFlags : undefined;
            resourceInputs["content"] = state ? state.content : undefined;
            resourceInputs["kvNamespaceBindings"] = state ? state.kvNamespaceBindings : undefined;
            resourceInputs["logpush"] = state ? state.logpush : undefined;
            resourceInputs["module"] = state ? state.module : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["placements"] = state ? state.placements : undefined;
            resourceInputs["plainTextBindings"] = state ? state.plainTextBindings : undefined;
            resourceInputs["queueBindings"] = state ? state.queueBindings : undefined;
            resourceInputs["r2BucketBindings"] = state ? state.r2BucketBindings : undefined;
            resourceInputs["secretTextBindings"] = state ? state.secretTextBindings : undefined;
            resourceInputs["serviceBindings"] = state ? state.serviceBindings : undefined;
            resourceInputs["webassemblyBindings"] = state ? state.webassemblyBindings : undefined;
        } else {
            const args = argsOrState as WorkerScriptArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.content === undefined) && !opts.urn) {
                throw new Error("Missing required property 'content'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["analyticsEngineBindings"] = args ? args.analyticsEngineBindings : undefined;
            resourceInputs["compatibilityDate"] = args ? args.compatibilityDate : undefined;
            resourceInputs["compatibilityFlags"] = args ? args.compatibilityFlags : undefined;
            resourceInputs["content"] = args ? args.content : undefined;
            resourceInputs["kvNamespaceBindings"] = args ? args.kvNamespaceBindings : undefined;
            resourceInputs["logpush"] = args ? args.logpush : undefined;
            resourceInputs["module"] = args ? args.module : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["placements"] = args ? args.placements : undefined;
            resourceInputs["plainTextBindings"] = args ? args.plainTextBindings : undefined;
            resourceInputs["queueBindings"] = args ? args.queueBindings : undefined;
            resourceInputs["r2BucketBindings"] = args ? args.r2BucketBindings : undefined;
            resourceInputs["secretTextBindings"] = args ? args.secretTextBindings : undefined;
            resourceInputs["serviceBindings"] = args ? args.serviceBindings : undefined;
            resourceInputs["webassemblyBindings"] = args ? args.webassemblyBindings : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkerScript.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkerScript resources.
 */
export interface WorkerScriptState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    analyticsEngineBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptAnalyticsEngineBinding>[]>;
    /**
     * The date to use for the compatibility flag.
     */
    compatibilityDate?: pulumi.Input<string>;
    /**
     * Compatibility flags used for Worker Scripts.
     */
    compatibilityFlags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The script content.
     */
    content?: pulumi.Input<string>;
    kvNamespaceBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptKvNamespaceBinding>[]>;
    /**
     * Enabling allows Worker events to be sent to a defined Logpush destination.
     */
    logpush?: pulumi.Input<boolean>;
    /**
     * The base64 encoded wasm module you want to store.
     */
    module?: pulumi.Input<boolean>;
    /**
     * The global variable for the binding in your Worker code.
     */
    name?: pulumi.Input<string>;
    placements?: pulumi.Input<pulumi.Input<inputs.WorkerScriptPlacement>[]>;
    plainTextBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptPlainTextBinding>[]>;
    queueBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptQueueBinding>[]>;
    r2BucketBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptR2BucketBinding>[]>;
    secretTextBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptSecretTextBinding>[]>;
    serviceBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptServiceBinding>[]>;
    webassemblyBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptWebassemblyBinding>[]>;
}

/**
 * The set of arguments for constructing a WorkerScript resource.
 */
export interface WorkerScriptArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    analyticsEngineBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptAnalyticsEngineBinding>[]>;
    /**
     * The date to use for the compatibility flag.
     */
    compatibilityDate?: pulumi.Input<string>;
    /**
     * Compatibility flags used for Worker Scripts.
     */
    compatibilityFlags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The script content.
     */
    content: pulumi.Input<string>;
    kvNamespaceBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptKvNamespaceBinding>[]>;
    /**
     * Enabling allows Worker events to be sent to a defined Logpush destination.
     */
    logpush?: pulumi.Input<boolean>;
    /**
     * The base64 encoded wasm module you want to store.
     */
    module?: pulumi.Input<boolean>;
    /**
     * The global variable for the binding in your Worker code.
     */
    name: pulumi.Input<string>;
    placements?: pulumi.Input<pulumi.Input<inputs.WorkerScriptPlacement>[]>;
    plainTextBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptPlainTextBinding>[]>;
    queueBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptQueueBinding>[]>;
    r2BucketBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptR2BucketBinding>[]>;
    secretTextBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptSecretTextBinding>[]>;
    serviceBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptServiceBinding>[]>;
    webassemblyBindings?: pulumi.Input<pulumi.Input<inputs.WorkerScriptWebassemblyBinding>[]>;
}
