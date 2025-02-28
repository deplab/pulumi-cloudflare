// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Access Application resource. Access
// Applications are used to restrict access to a whole application using an
// authorisation gateway managed by Cloudflare.
//
// > It's required that an `accountId` or `zoneId` is provided and in
// most cases using either is fine. However, if you're using a scoped
// access token, you must provide the argument that matches the token's
// scope. For example, an access token that is scoped to the "example.com"
// zone needs to use the `zoneId` argument.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewAccessApplication(ctx, "stagingApp", &cloudflare.AccessApplicationArgs{
//				CorsHeaders: cloudflare.AccessApplicationCorsHeaderArray{
//					&cloudflare.AccessApplicationCorsHeaderArgs{
//						AllowCredentials: pulumi.Bool(true),
//						AllowedMethods: pulumi.StringArray{
//							pulumi.String("GET"),
//							pulumi.String("POST"),
//							pulumi.String("OPTIONS"),
//						},
//						AllowedOrigins: pulumi.StringArray{
//							pulumi.String("https://example.com"),
//						},
//						MaxAge: pulumi.Int(10),
//					},
//				},
//				Domain:          pulumi.String("staging.example.com"),
//				Name:            pulumi.String("staging application"),
//				SessionDuration: pulumi.String("24h"),
//				Type:            pulumi.String("self_hosted"),
//				ZoneId:          pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/accessApplication:AccessApplication example <account_id>/<application_id>
//
// ```
type AccessApplication struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The identity providers selected for the application.
	AllowedIdps pulumi.StringArrayOutput `pulumi:"allowedIdps"`
	// Option to show/hide applications in App Launcher. Defaults to `true`.
	AppLauncherVisible pulumi.BoolPtrOutput `pulumi:"appLauncherVisible"`
	// Application Audience (AUD) Tag of the application.
	Aud pulumi.StringOutput `pulumi:"aud"`
	// Option to skip identity provider selection if only one is configured in `allowedIdps`. Defaults to `false`.
	AutoRedirectToIdentity pulumi.BoolPtrOutput `pulumi:"autoRedirectToIdentity"`
	// CORS configuration for the Access Application. See below for reference structure.
	CorsHeaders AccessApplicationCorsHeaderArrayOutput `pulumi:"corsHeaders"`
	// Option that returns a custom error message when a user is denied access to the application.
	CustomDenyMessage pulumi.StringPtrOutput `pulumi:"customDenyMessage"`
	// Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
	CustomDenyUrl pulumi.StringPtrOutput `pulumi:"customDenyUrl"`
	// Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
	CustomNonIdentityDenyUrl pulumi.StringPtrOutput `pulumi:"customNonIdentityDenyUrl"`
	// The custom pages selected for the application.
	CustomPages pulumi.StringArrayOutput `pulumi:"customPages"`
	// The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie pulumi.BoolPtrOutput `pulumi:"enableBindingCookie"`
	// Option to add the `HttpOnly` cookie flag to access tokens.
	HttpOnlyCookieAttribute pulumi.BoolPtrOutput `pulumi:"httpOnlyCookieAttribute"`
	// Image URL for the logo shown in the app launcher dashboard.
	LogoUrl pulumi.StringPtrOutput `pulumi:"logoUrl"`
	// The name of the attribute as provided to the SaaS app.
	Name pulumi.StringOutput `pulumi:"name"`
	// SaaS configuration for the Access Application.
	SaasApp AccessApplicationSaasAppPtrOutput `pulumi:"saasApp"`
	// Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
	SameSiteCookieAttribute pulumi.StringPtrOutput `pulumi:"sameSiteCookieAttribute"`
	// List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
	SelfHostedDomains pulumi.StringArrayOutput `pulumi:"selfHostedDomains"`
	// Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
	ServiceAuth401Redirect pulumi.BoolPtrOutput `pulumi:"serviceAuth401Redirect"`
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
	SessionDuration pulumi.StringPtrOutput `pulumi:"sessionDuration"`
	// Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
	SkipInterstitial pulumi.BoolPtrOutput `pulumi:"skipInterstitial"`
	// The itags associated with the application.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The application type. Available values: `appLauncher`, `bookmark`, `biso`, `dashSso`, `saas`, `selfHosted`, `ssh`, `vnc`, `warp`. Defaults to `selfHosted`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewAccessApplication registers a new resource with the given unique name, arguments, and options.
func NewAccessApplication(ctx *pulumi.Context,
	name string, args *AccessApplicationArgs, opts ...pulumi.ResourceOption) (*AccessApplication, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessApplication
	err := ctx.RegisterResource("cloudflare:index/accessApplication:AccessApplication", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessApplication gets an existing AccessApplication resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessApplication(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessApplicationState, opts ...pulumi.ResourceOption) (*AccessApplication, error) {
	var resource AccessApplication
	err := ctx.ReadResource("cloudflare:index/accessApplication:AccessApplication", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessApplication resources.
type accessApplicationState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// The identity providers selected for the application.
	AllowedIdps []string `pulumi:"allowedIdps"`
	// Option to show/hide applications in App Launcher. Defaults to `true`.
	AppLauncherVisible *bool `pulumi:"appLauncherVisible"`
	// Application Audience (AUD) Tag of the application.
	Aud *string `pulumi:"aud"`
	// Option to skip identity provider selection if only one is configured in `allowedIdps`. Defaults to `false`.
	AutoRedirectToIdentity *bool `pulumi:"autoRedirectToIdentity"`
	// CORS configuration for the Access Application. See below for reference structure.
	CorsHeaders []AccessApplicationCorsHeader `pulumi:"corsHeaders"`
	// Option that returns a custom error message when a user is denied access to the application.
	CustomDenyMessage *string `pulumi:"customDenyMessage"`
	// Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
	CustomDenyUrl *string `pulumi:"customDenyUrl"`
	// Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
	CustomNonIdentityDenyUrl *string `pulumi:"customNonIdentityDenyUrl"`
	// The custom pages selected for the application.
	CustomPages []string `pulumi:"customPages"`
	// The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
	Domain *string `pulumi:"domain"`
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie *bool `pulumi:"enableBindingCookie"`
	// Option to add the `HttpOnly` cookie flag to access tokens.
	HttpOnlyCookieAttribute *bool `pulumi:"httpOnlyCookieAttribute"`
	// Image URL for the logo shown in the app launcher dashboard.
	LogoUrl *string `pulumi:"logoUrl"`
	// The name of the attribute as provided to the SaaS app.
	Name *string `pulumi:"name"`
	// SaaS configuration for the Access Application.
	SaasApp *AccessApplicationSaasApp `pulumi:"saasApp"`
	// Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
	SameSiteCookieAttribute *string `pulumi:"sameSiteCookieAttribute"`
	// List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
	SelfHostedDomains []string `pulumi:"selfHostedDomains"`
	// Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
	ServiceAuth401Redirect *bool `pulumi:"serviceAuth401Redirect"`
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
	SessionDuration *string `pulumi:"sessionDuration"`
	// Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
	SkipInterstitial *bool `pulumi:"skipInterstitial"`
	// The itags associated with the application.
	Tags []string `pulumi:"tags"`
	// The application type. Available values: `appLauncher`, `bookmark`, `biso`, `dashSso`, `saas`, `selfHosted`, `ssh`, `vnc`, `warp`. Defaults to `selfHosted`.
	Type *string `pulumi:"type"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

type AccessApplicationState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// The identity providers selected for the application.
	AllowedIdps pulumi.StringArrayInput
	// Option to show/hide applications in App Launcher. Defaults to `true`.
	AppLauncherVisible pulumi.BoolPtrInput
	// Application Audience (AUD) Tag of the application.
	Aud pulumi.StringPtrInput
	// Option to skip identity provider selection if only one is configured in `allowedIdps`. Defaults to `false`.
	AutoRedirectToIdentity pulumi.BoolPtrInput
	// CORS configuration for the Access Application. See below for reference structure.
	CorsHeaders AccessApplicationCorsHeaderArrayInput
	// Option that returns a custom error message when a user is denied access to the application.
	CustomDenyMessage pulumi.StringPtrInput
	// Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
	CustomDenyUrl pulumi.StringPtrInput
	// Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
	CustomNonIdentityDenyUrl pulumi.StringPtrInput
	// The custom pages selected for the application.
	CustomPages pulumi.StringArrayInput
	// The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
	Domain pulumi.StringPtrInput
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie pulumi.BoolPtrInput
	// Option to add the `HttpOnly` cookie flag to access tokens.
	HttpOnlyCookieAttribute pulumi.BoolPtrInput
	// Image URL for the logo shown in the app launcher dashboard.
	LogoUrl pulumi.StringPtrInput
	// The name of the attribute as provided to the SaaS app.
	Name pulumi.StringPtrInput
	// SaaS configuration for the Access Application.
	SaasApp AccessApplicationSaasAppPtrInput
	// Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
	SameSiteCookieAttribute pulumi.StringPtrInput
	// List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
	SelfHostedDomains pulumi.StringArrayInput
	// Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
	ServiceAuth401Redirect pulumi.BoolPtrInput
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
	SessionDuration pulumi.StringPtrInput
	// Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
	SkipInterstitial pulumi.BoolPtrInput
	// The itags associated with the application.
	Tags pulumi.StringArrayInput
	// The application type. Available values: `appLauncher`, `bookmark`, `biso`, `dashSso`, `saas`, `selfHosted`, `ssh`, `vnc`, `warp`. Defaults to `selfHosted`.
	Type pulumi.StringPtrInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessApplicationState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessApplicationState)(nil)).Elem()
}

type accessApplicationArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// The identity providers selected for the application.
	AllowedIdps []string `pulumi:"allowedIdps"`
	// Option to show/hide applications in App Launcher. Defaults to `true`.
	AppLauncherVisible *bool `pulumi:"appLauncherVisible"`
	// Option to skip identity provider selection if only one is configured in `allowedIdps`. Defaults to `false`.
	AutoRedirectToIdentity *bool `pulumi:"autoRedirectToIdentity"`
	// CORS configuration for the Access Application. See below for reference structure.
	CorsHeaders []AccessApplicationCorsHeader `pulumi:"corsHeaders"`
	// Option that returns a custom error message when a user is denied access to the application.
	CustomDenyMessage *string `pulumi:"customDenyMessage"`
	// Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
	CustomDenyUrl *string `pulumi:"customDenyUrl"`
	// Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
	CustomNonIdentityDenyUrl *string `pulumi:"customNonIdentityDenyUrl"`
	// The custom pages selected for the application.
	CustomPages []string `pulumi:"customPages"`
	// The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
	Domain *string `pulumi:"domain"`
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie *bool `pulumi:"enableBindingCookie"`
	// Option to add the `HttpOnly` cookie flag to access tokens.
	HttpOnlyCookieAttribute *bool `pulumi:"httpOnlyCookieAttribute"`
	// Image URL for the logo shown in the app launcher dashboard.
	LogoUrl *string `pulumi:"logoUrl"`
	// The name of the attribute as provided to the SaaS app.
	Name string `pulumi:"name"`
	// SaaS configuration for the Access Application.
	SaasApp *AccessApplicationSaasApp `pulumi:"saasApp"`
	// Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
	SameSiteCookieAttribute *string `pulumi:"sameSiteCookieAttribute"`
	// List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
	SelfHostedDomains []string `pulumi:"selfHostedDomains"`
	// Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
	ServiceAuth401Redirect *bool `pulumi:"serviceAuth401Redirect"`
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
	SessionDuration *string `pulumi:"sessionDuration"`
	// Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
	SkipInterstitial *bool `pulumi:"skipInterstitial"`
	// The itags associated with the application.
	Tags []string `pulumi:"tags"`
	// The application type. Available values: `appLauncher`, `bookmark`, `biso`, `dashSso`, `saas`, `selfHosted`, `ssh`, `vnc`, `warp`. Defaults to `selfHosted`.
	Type *string `pulumi:"type"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessApplication resource.
type AccessApplicationArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// The identity providers selected for the application.
	AllowedIdps pulumi.StringArrayInput
	// Option to show/hide applications in App Launcher. Defaults to `true`.
	AppLauncherVisible pulumi.BoolPtrInput
	// Option to skip identity provider selection if only one is configured in `allowedIdps`. Defaults to `false`.
	AutoRedirectToIdentity pulumi.BoolPtrInput
	// CORS configuration for the Access Application. See below for reference structure.
	CorsHeaders AccessApplicationCorsHeaderArrayInput
	// Option that returns a custom error message when a user is denied access to the application.
	CustomDenyMessage pulumi.StringPtrInput
	// Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
	CustomDenyUrl pulumi.StringPtrInput
	// Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
	CustomNonIdentityDenyUrl pulumi.StringPtrInput
	// The custom pages selected for the application.
	CustomPages pulumi.StringArrayInput
	// The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
	Domain pulumi.StringPtrInput
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie pulumi.BoolPtrInput
	// Option to add the `HttpOnly` cookie flag to access tokens.
	HttpOnlyCookieAttribute pulumi.BoolPtrInput
	// Image URL for the logo shown in the app launcher dashboard.
	LogoUrl pulumi.StringPtrInput
	// The name of the attribute as provided to the SaaS app.
	Name pulumi.StringInput
	// SaaS configuration for the Access Application.
	SaasApp AccessApplicationSaasAppPtrInput
	// Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
	SameSiteCookieAttribute pulumi.StringPtrInput
	// List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
	SelfHostedDomains pulumi.StringArrayInput
	// Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
	ServiceAuth401Redirect pulumi.BoolPtrInput
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
	SessionDuration pulumi.StringPtrInput
	// Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
	SkipInterstitial pulumi.BoolPtrInput
	// The itags associated with the application.
	Tags pulumi.StringArrayInput
	// The application type. Available values: `appLauncher`, `bookmark`, `biso`, `dashSso`, `saas`, `selfHosted`, `ssh`, `vnc`, `warp`. Defaults to `selfHosted`.
	Type pulumi.StringPtrInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessApplicationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessApplicationArgs)(nil)).Elem()
}

type AccessApplicationInput interface {
	pulumi.Input

	ToAccessApplicationOutput() AccessApplicationOutput
	ToAccessApplicationOutputWithContext(ctx context.Context) AccessApplicationOutput
}

func (*AccessApplication) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessApplication)(nil)).Elem()
}

func (i *AccessApplication) ToAccessApplicationOutput() AccessApplicationOutput {
	return i.ToAccessApplicationOutputWithContext(context.Background())
}

func (i *AccessApplication) ToAccessApplicationOutputWithContext(ctx context.Context) AccessApplicationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessApplicationOutput)
}

// AccessApplicationArrayInput is an input type that accepts AccessApplicationArray and AccessApplicationArrayOutput values.
// You can construct a concrete instance of `AccessApplicationArrayInput` via:
//
//	AccessApplicationArray{ AccessApplicationArgs{...} }
type AccessApplicationArrayInput interface {
	pulumi.Input

	ToAccessApplicationArrayOutput() AccessApplicationArrayOutput
	ToAccessApplicationArrayOutputWithContext(context.Context) AccessApplicationArrayOutput
}

type AccessApplicationArray []AccessApplicationInput

func (AccessApplicationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessApplication)(nil)).Elem()
}

func (i AccessApplicationArray) ToAccessApplicationArrayOutput() AccessApplicationArrayOutput {
	return i.ToAccessApplicationArrayOutputWithContext(context.Background())
}

func (i AccessApplicationArray) ToAccessApplicationArrayOutputWithContext(ctx context.Context) AccessApplicationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessApplicationArrayOutput)
}

// AccessApplicationMapInput is an input type that accepts AccessApplicationMap and AccessApplicationMapOutput values.
// You can construct a concrete instance of `AccessApplicationMapInput` via:
//
//	AccessApplicationMap{ "key": AccessApplicationArgs{...} }
type AccessApplicationMapInput interface {
	pulumi.Input

	ToAccessApplicationMapOutput() AccessApplicationMapOutput
	ToAccessApplicationMapOutputWithContext(context.Context) AccessApplicationMapOutput
}

type AccessApplicationMap map[string]AccessApplicationInput

func (AccessApplicationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessApplication)(nil)).Elem()
}

func (i AccessApplicationMap) ToAccessApplicationMapOutput() AccessApplicationMapOutput {
	return i.ToAccessApplicationMapOutputWithContext(context.Background())
}

func (i AccessApplicationMap) ToAccessApplicationMapOutputWithContext(ctx context.Context) AccessApplicationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessApplicationMapOutput)
}

type AccessApplicationOutput struct{ *pulumi.OutputState }

func (AccessApplicationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessApplication)(nil)).Elem()
}

func (o AccessApplicationOutput) ToAccessApplicationOutput() AccessApplicationOutput {
	return o
}

func (o AccessApplicationOutput) ToAccessApplicationOutputWithContext(ctx context.Context) AccessApplicationOutput {
	return o
}

// The account identifier to target for the resource. Conflicts with `zoneId`.
func (o AccessApplicationOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The identity providers selected for the application.
func (o AccessApplicationOutput) AllowedIdps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringArrayOutput { return v.AllowedIdps }).(pulumi.StringArrayOutput)
}

// Option to show/hide applications in App Launcher. Defaults to `true`.
func (o AccessApplicationOutput) AppLauncherVisible() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.BoolPtrOutput { return v.AppLauncherVisible }).(pulumi.BoolPtrOutput)
}

// Application Audience (AUD) Tag of the application.
func (o AccessApplicationOutput) Aud() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringOutput { return v.Aud }).(pulumi.StringOutput)
}

// Option to skip identity provider selection if only one is configured in `allowedIdps`. Defaults to `false`.
func (o AccessApplicationOutput) AutoRedirectToIdentity() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.BoolPtrOutput { return v.AutoRedirectToIdentity }).(pulumi.BoolPtrOutput)
}

// CORS configuration for the Access Application. See below for reference structure.
func (o AccessApplicationOutput) CorsHeaders() AccessApplicationCorsHeaderArrayOutput {
	return o.ApplyT(func(v *AccessApplication) AccessApplicationCorsHeaderArrayOutput { return v.CorsHeaders }).(AccessApplicationCorsHeaderArrayOutput)
}

// Option that returns a custom error message when a user is denied access to the application.
func (o AccessApplicationOutput) CustomDenyMessage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringPtrOutput { return v.CustomDenyMessage }).(pulumi.StringPtrOutput)
}

// Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
func (o AccessApplicationOutput) CustomDenyUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringPtrOutput { return v.CustomDenyUrl }).(pulumi.StringPtrOutput)
}

// Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
func (o AccessApplicationOutput) CustomNonIdentityDenyUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringPtrOutput { return v.CustomNonIdentityDenyUrl }).(pulumi.StringPtrOutput)
}

// The custom pages selected for the application.
func (o AccessApplicationOutput) CustomPages() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringArrayOutput { return v.CustomPages }).(pulumi.StringArrayOutput)
}

// The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
func (o AccessApplicationOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringOutput { return v.Domain }).(pulumi.StringOutput)
}

// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
func (o AccessApplicationOutput) EnableBindingCookie() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.BoolPtrOutput { return v.EnableBindingCookie }).(pulumi.BoolPtrOutput)
}

// Option to add the `HttpOnly` cookie flag to access tokens.
func (o AccessApplicationOutput) HttpOnlyCookieAttribute() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.BoolPtrOutput { return v.HttpOnlyCookieAttribute }).(pulumi.BoolPtrOutput)
}

// Image URL for the logo shown in the app launcher dashboard.
func (o AccessApplicationOutput) LogoUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringPtrOutput { return v.LogoUrl }).(pulumi.StringPtrOutput)
}

// The name of the attribute as provided to the SaaS app.
func (o AccessApplicationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// SaaS configuration for the Access Application.
func (o AccessApplicationOutput) SaasApp() AccessApplicationSaasAppPtrOutput {
	return o.ApplyT(func(v *AccessApplication) AccessApplicationSaasAppPtrOutput { return v.SaasApp }).(AccessApplicationSaasAppPtrOutput)
}

// Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
func (o AccessApplicationOutput) SameSiteCookieAttribute() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringPtrOutput { return v.SameSiteCookieAttribute }).(pulumi.StringPtrOutput)
}

// List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
func (o AccessApplicationOutput) SelfHostedDomains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringArrayOutput { return v.SelfHostedDomains }).(pulumi.StringArrayOutput)
}

// Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
func (o AccessApplicationOutput) ServiceAuth401Redirect() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.BoolPtrOutput { return v.ServiceAuth401Redirect }).(pulumi.BoolPtrOutput)
}

// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
func (o AccessApplicationOutput) SessionDuration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringPtrOutput { return v.SessionDuration }).(pulumi.StringPtrOutput)
}

// Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
func (o AccessApplicationOutput) SkipInterstitial() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.BoolPtrOutput { return v.SkipInterstitial }).(pulumi.BoolPtrOutput)
}

// The itags associated with the application.
func (o AccessApplicationOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// The application type. Available values: `appLauncher`, `bookmark`, `biso`, `dashSso`, `saas`, `selfHosted`, `ssh`, `vnc`, `warp`. Defaults to `selfHosted`.
func (o AccessApplicationOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

// The zone identifier to target for the resource. Conflicts with `accountId`.
func (o AccessApplicationOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessApplication) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type AccessApplicationArrayOutput struct{ *pulumi.OutputState }

func (AccessApplicationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessApplication)(nil)).Elem()
}

func (o AccessApplicationArrayOutput) ToAccessApplicationArrayOutput() AccessApplicationArrayOutput {
	return o
}

func (o AccessApplicationArrayOutput) ToAccessApplicationArrayOutputWithContext(ctx context.Context) AccessApplicationArrayOutput {
	return o
}

func (o AccessApplicationArrayOutput) Index(i pulumi.IntInput) AccessApplicationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessApplication {
		return vs[0].([]*AccessApplication)[vs[1].(int)]
	}).(AccessApplicationOutput)
}

type AccessApplicationMapOutput struct{ *pulumi.OutputState }

func (AccessApplicationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessApplication)(nil)).Elem()
}

func (o AccessApplicationMapOutput) ToAccessApplicationMapOutput() AccessApplicationMapOutput {
	return o
}

func (o AccessApplicationMapOutput) ToAccessApplicationMapOutputWithContext(ctx context.Context) AccessApplicationMapOutput {
	return o
}

func (o AccessApplicationMapOutput) MapIndex(k pulumi.StringInput) AccessApplicationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessApplication {
		return vs[0].(map[string]*AccessApplication)[vs[1].(string)]
	}).(AccessApplicationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessApplicationInput)(nil)).Elem(), &AccessApplication{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessApplicationArrayInput)(nil)).Elem(), AccessApplicationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessApplicationMapInput)(nil)).Elem(), AccessApplicationMap{})
	pulumi.RegisterOutputType(AccessApplicationOutput{})
	pulumi.RegisterOutputType(AccessApplicationArrayOutput{})
	pulumi.RegisterOutputType(AccessApplicationMapOutput{})
}
