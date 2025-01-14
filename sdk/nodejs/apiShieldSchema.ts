// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource to manage a schema in API Shield Schema Validation 2.0.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * import * as fs from "fs";
 *
 * const petstoreSchema = new cloudflare.ApiShieldSchema("petstoreSchema", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     name: "myschema",
 *     kind: "openapi_v3",
 *     validationEnabled: true,
 *     source: fs.readFileSync("./schemas/petstore.json"),
 * });
 * ```
 */
export class ApiShieldSchema extends pulumi.CustomResource {
    /**
     * Get an existing ApiShieldSchema resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiShieldSchemaState, opts?: pulumi.CustomResourceOptions): ApiShieldSchema {
        return new ApiShieldSchema(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/apiShieldSchema:ApiShieldSchema';

    /**
     * Returns true if the given object is an instance of ApiShieldSchema.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiShieldSchema {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiShieldSchema.__pulumiType;
    }

    /**
     * Kind of schema. Defaults to `openapiV3`. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly kind!: pulumi.Output<string | undefined>;
    /**
     * Name of the schema. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Schema file bytes. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly source!: pulumi.Output<string>;
    /**
     * Flag whether schema is enabled for validation.
     */
    public readonly validationEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a ApiShieldSchema resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApiShieldSchemaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiShieldSchemaArgs | ApiShieldSchemaState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApiShieldSchemaState | undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["validationEnabled"] = state ? state.validationEnabled : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as ApiShieldSchemaArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.source === undefined) && !opts.urn) {
                throw new Error("Missing required property 'source'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["kind"] = args ? args.kind : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["validationEnabled"] = args ? args.validationEnabled : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApiShieldSchema.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiShieldSchema resources.
 */
export interface ApiShieldSchemaState {
    /**
     * Kind of schema. Defaults to `openapiV3`. **Modifying this attribute will force creation of a new resource.**
     */
    kind?: pulumi.Input<string>;
    /**
     * Name of the schema. **Modifying this attribute will force creation of a new resource.**
     */
    name?: pulumi.Input<string>;
    /**
     * Schema file bytes. **Modifying this attribute will force creation of a new resource.**
     */
    source?: pulumi.Input<string>;
    /**
     * Flag whether schema is enabled for validation.
     */
    validationEnabled?: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApiShieldSchema resource.
 */
export interface ApiShieldSchemaArgs {
    /**
     * Kind of schema. Defaults to `openapiV3`. **Modifying this attribute will force creation of a new resource.**
     */
    kind?: pulumi.Input<string>;
    /**
     * Name of the schema. **Modifying this attribute will force creation of a new resource.**
     */
    name: pulumi.Input<string>;
    /**
     * Schema file bytes. **Modifying this attribute will force creation of a new resource.**
     */
    source: pulumi.Input<string>;
    /**
     * Flag whether schema is enabled for validation.
     */
    validationEnabled?: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
