// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * Certificate packs can be imported using a composite ID of the zone ID and certificate pack ID. This isn't recommended and it is advised to replace the certificate entirely instead.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/certificatePack:CertificatePack example cb029e245cfdd66dc8d2e570d5dd3322/8fda82e2-6af9-4eb2-992a-5ab65b792ef1
 * ```
 */
export class CertificatePack extends pulumi.CustomResource {
    /**
     * Get an existing CertificatePack resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CertificatePackState, opts?: pulumi.CustomResourceOptions): CertificatePack {
        return new CertificatePack(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/certificatePack:CertificatePack';

    /**
     * Returns true if the given object is an instance of CertificatePack.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CertificatePack {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CertificatePack.__pulumiType;
    }

    /**
     * Which certificate
     * authority to issue the certificate pack. Allowed values: `"digicert"`,
     * `"letsEncrypt"`.
     */
    public readonly certificateAuthority!: pulumi.Output<string>;
    /**
     * Whether or not to include
     * Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
     * if set to `true`.
     */
    public readonly cloudflareBranding!: pulumi.Output<boolean | undefined>;
    /**
     * List of hostnames to provision the certificate pack for.
     * Note: If using Let's Encrypt, you cannot use individual subdomains and only a
     * wildcard for subdomain is available.
     */
    public readonly hosts!: pulumi.Output<string[]>;
    /**
     * Certificate pack configuration type.
     * Allowed values: `"custom"`, `"dedicatedCustom"`, `"advanced"`.
     */
    public readonly type!: pulumi.Output<string>;
    public readonly validationErrors!: pulumi.Output<outputs.CertificatePackValidationError[]>;
    /**
     * Which validation method to
     * use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
     */
    public readonly validationMethod!: pulumi.Output<string | undefined>;
    public readonly validationRecords!: pulumi.Output<outputs.CertificatePackValidationRecord[]>;
    /**
     * How long the certificate is valid
     * for. Note: If using Let's Encrypt, this value can only be 90 days.
     * Allowed values: 14, 30, 90, 365.
     */
    public readonly validityDays!: pulumi.Output<number | undefined>;
    /**
     * The DNS zone to which the certificate pack should be added.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a CertificatePack resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CertificatePackArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CertificatePackArgs | CertificatePackState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CertificatePackState | undefined;
            resourceInputs["certificateAuthority"] = state ? state.certificateAuthority : undefined;
            resourceInputs["cloudflareBranding"] = state ? state.cloudflareBranding : undefined;
            resourceInputs["hosts"] = state ? state.hosts : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["validationErrors"] = state ? state.validationErrors : undefined;
            resourceInputs["validationMethod"] = state ? state.validationMethod : undefined;
            resourceInputs["validationRecords"] = state ? state.validationRecords : undefined;
            resourceInputs["validityDays"] = state ? state.validityDays : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as CertificatePackArgs | undefined;
            if ((!args || args.hosts === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hosts'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["certificateAuthority"] = args ? args.certificateAuthority : undefined;
            resourceInputs["cloudflareBranding"] = args ? args.cloudflareBranding : undefined;
            resourceInputs["hosts"] = args ? args.hosts : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["validationErrors"] = args ? args.validationErrors : undefined;
            resourceInputs["validationMethod"] = args ? args.validationMethod : undefined;
            resourceInputs["validationRecords"] = args ? args.validationRecords : undefined;
            resourceInputs["validityDays"] = args ? args.validityDays : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CertificatePack.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CertificatePack resources.
 */
export interface CertificatePackState {
    /**
     * Which certificate
     * authority to issue the certificate pack. Allowed values: `"digicert"`,
     * `"letsEncrypt"`.
     */
    certificateAuthority?: pulumi.Input<string>;
    /**
     * Whether or not to include
     * Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
     * if set to `true`.
     */
    cloudflareBranding?: pulumi.Input<boolean>;
    /**
     * List of hostnames to provision the certificate pack for.
     * Note: If using Let's Encrypt, you cannot use individual subdomains and only a
     * wildcard for subdomain is available.
     */
    hosts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Certificate pack configuration type.
     * Allowed values: `"custom"`, `"dedicatedCustom"`, `"advanced"`.
     */
    type?: pulumi.Input<string>;
    validationErrors?: pulumi.Input<pulumi.Input<inputs.CertificatePackValidationError>[]>;
    /**
     * Which validation method to
     * use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
     */
    validationMethod?: pulumi.Input<string>;
    validationRecords?: pulumi.Input<pulumi.Input<inputs.CertificatePackValidationRecord>[]>;
    /**
     * How long the certificate is valid
     * for. Note: If using Let's Encrypt, this value can only be 90 days.
     * Allowed values: 14, 30, 90, 365.
     */
    validityDays?: pulumi.Input<number>;
    /**
     * The DNS zone to which the certificate pack should be added.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CertificatePack resource.
 */
export interface CertificatePackArgs {
    /**
     * Which certificate
     * authority to issue the certificate pack. Allowed values: `"digicert"`,
     * `"letsEncrypt"`.
     */
    certificateAuthority?: pulumi.Input<string>;
    /**
     * Whether or not to include
     * Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
     * if set to `true`.
     */
    cloudflareBranding?: pulumi.Input<boolean>;
    /**
     * List of hostnames to provision the certificate pack for.
     * Note: If using Let's Encrypt, you cannot use individual subdomains and only a
     * wildcard for subdomain is available.
     */
    hosts: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Certificate pack configuration type.
     * Allowed values: `"custom"`, `"dedicatedCustom"`, `"advanced"`.
     */
    type: pulumi.Input<string>;
    validationErrors?: pulumi.Input<pulumi.Input<inputs.CertificatePackValidationError>[]>;
    /**
     * Which validation method to
     * use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
     */
    validationMethod?: pulumi.Input<string>;
    validationRecords?: pulumi.Input<pulumi.Input<inputs.CertificatePackValidationRecord>[]>;
    /**
     * How long the certificate is valid
     * for. Note: If using Let's Encrypt, this value can only be 90 days.
     * Allowed values: 14, 30, 90, 365.
     */
    validityDays?: pulumi.Input<number>;
    /**
     * The DNS zone to which the certificate pack should be added.
     */
    zoneId: pulumi.Input<string>;
}
