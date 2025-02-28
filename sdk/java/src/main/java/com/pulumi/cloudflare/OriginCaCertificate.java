// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.OriginCaCertificateArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.OriginCaCertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.tls.PrivateKey;
 * import com.pulumi.tls.PrivateKeyArgs;
 * import com.pulumi.tls.CertRequest;
 * import com.pulumi.tls.CertRequestArgs;
 * import com.pulumi.tls.inputs.CertRequestSubjectArgs;
 * import com.pulumi.cloudflare.OriginCaCertificate;
 * import com.pulumi.cloudflare.OriginCaCertificateArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var examplePrivateKey = new PrivateKey(&#34;examplePrivateKey&#34;, PrivateKeyArgs.builder()        
 *             .algorithm(&#34;RSA&#34;)
 *             .build());
 * 
 *         var exampleCertRequest = new CertRequest(&#34;exampleCertRequest&#34;, CertRequestArgs.builder()        
 *             .privateKeyPem(examplePrivateKey.privateKeyPem())
 *             .subjects(CertRequestSubjectArgs.builder()
 *                 .commonName(&#34;&#34;)
 *                 .organization(&#34;Terraform Test&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleOriginCaCertificate = new OriginCaCertificate(&#34;exampleOriginCaCertificate&#34;, OriginCaCertificateArgs.builder()        
 *             .csr(exampleCertRequest.certRequestPem())
 *             .hostnames(&#34;example.com&#34;)
 *             .requestType(&#34;origin-rsa&#34;)
 *             .requestedValidity(7)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/originCaCertificate:OriginCaCertificate example &lt;certificate_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/originCaCertificate:OriginCaCertificate")
public class OriginCaCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The Origin CA certificate.
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output<String> certificate;

    /**
     * @return The Origin CA certificate.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    /**
     * The Certificate Signing Request. Must be newline-encoded. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="csr", refs={String.class}, tree="[0]")
    private Output<String> csr;

    /**
     * @return The Certificate Signing Request. Must be newline-encoded. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> csr() {
        return this.csr;
    }
    /**
     * The datetime when the certificate will expire.
     * 
     */
    @Export(name="expiresOn", refs={String.class}, tree="[0]")
    private Output<String> expiresOn;

    /**
     * @return The datetime when the certificate will expire.
     * 
     */
    public Output<String> expiresOn() {
        return this.expiresOn;
    }
    /**
     * A list of hostnames or wildcard names bound to the certificate. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="hostnames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> hostnames;

    /**
     * @return A list of hostnames or wildcard names bound to the certificate. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<List<String>> hostnames() {
        return this.hostnames;
    }
    /**
     * Number of days prior to the expiry to trigger a renewal of the certificate if a Terraform operation is run.
     * 
     */
    @Export(name="minDaysForRenewal", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minDaysForRenewal;

    /**
     * @return Number of days prior to the expiry to trigger a renewal of the certificate if a Terraform operation is run.
     * 
     */
    public Output<Optional<Integer>> minDaysForRenewal() {
        return Codegen.optional(this.minDaysForRenewal);
    }
    /**
     * The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="requestType", refs={String.class}, tree="[0]")
    private Output<String> requestType;

    /**
     * @return The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> requestType() {
        return this.requestType;
    }
    /**
     * The number of days for which the certificate should be valid. Available values: `7`, `30`, `90`, `365`, `730`, `1095`, `5475`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="requestedValidity", refs={Integer.class}, tree="[0]")
    private Output<Integer> requestedValidity;

    /**
     * @return The number of days for which the certificate should be valid. Available values: `7`, `30`, `90`, `365`, `730`, `1095`, `5475`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Integer> requestedValidity() {
        return this.requestedValidity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OriginCaCertificate(String name) {
        this(name, OriginCaCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OriginCaCertificate(String name, OriginCaCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OriginCaCertificate(String name, OriginCaCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/originCaCertificate:OriginCaCertificate", name, args == null ? OriginCaCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OriginCaCertificate(String name, Output<String> id, @Nullable OriginCaCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/originCaCertificate:OriginCaCertificate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static OriginCaCertificate get(String name, Output<String> id, @Nullable OriginCaCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OriginCaCertificate(name, id, state, options);
    }
}
