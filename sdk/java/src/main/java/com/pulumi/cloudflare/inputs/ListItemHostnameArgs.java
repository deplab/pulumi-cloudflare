// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListItemHostnameArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListItemHostnameArgs Empty = new ListItemHostnameArgs();

    /**
     * The FQDN to match on.
     * 
     */
    @Import(name="urlHostname", required=true)
    private Output<String> urlHostname;

    /**
     * @return The FQDN to match on.
     * 
     */
    public Output<String> urlHostname() {
        return this.urlHostname;
    }

    private ListItemHostnameArgs() {}

    private ListItemHostnameArgs(ListItemHostnameArgs $) {
        this.urlHostname = $.urlHostname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListItemHostnameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListItemHostnameArgs $;

        public Builder() {
            $ = new ListItemHostnameArgs();
        }

        public Builder(ListItemHostnameArgs defaults) {
            $ = new ListItemHostnameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param urlHostname The FQDN to match on.
         * 
         * @return builder
         * 
         */
        public Builder urlHostname(Output<String> urlHostname) {
            $.urlHostname = urlHostname;
            return this;
        }

        /**
         * @param urlHostname The FQDN to match on.
         * 
         * @return builder
         * 
         */
        public Builder urlHostname(String urlHostname) {
            return urlHostname(Output.of(urlHostname));
        }

        public ListItemHostnameArgs build() {
            $.urlHostname = Objects.requireNonNull($.urlHostname, "expected parameter 'urlHostname' to be non-null");
            return $;
        }
    }

}
