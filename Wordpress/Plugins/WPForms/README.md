# WPForms
[WPForms](https://wpforms.com/) is a Wordpress plugin that builds forms on your website using a drag and drop builder. WPForms is a great plugin to create Lead forms, which are online forms used to collect information from potential clients called "leads". Using WPForms, we can create a Contact Me form for a potential client to input their information and send you an email with their details.

### Create Contact Form
Let's start off by creating a new Contact form using the plugin. First, in the plugin menu, click "Add New":

![add new](misc/wpforms-add-new.png)

Now you'll see a catalog of template forms to use, but let's use the Simple Contact Form template:

![simple contact form](misc/wpforms-simple-contact-form.png)

Now you can use the form bulder to build the form. There are some fancy fields that you'll need to buy with the Pro version:

![form builder](misc/wpforms-form-builder.png)

Let's add a new field called the "Phone Number" field:

![phone number form](misc/wpforms-add-phone-number-field.png)

Now in the Settings tab of the form, you have several options for the form. From the General settings, you can set the form name, description, submit button text, etc. You also have advanced options to set the form's CSS styling:

![general](misc/wpforms-general.png)

The [Notifications settings](https://wpforms.com/docs/setup-form-notification-wpforms/) is the notification to send (e.g. email) when the user completes the form. The free version of WPForms only allows email notifications:

![notifications](misc/wpforms-notifications.png)

Let's go to the [Confirmations settings](https://wpforms.com/docs/setup-form-confirmation-wpforms/) and make a personalized message when the user completes the form:

![confirmations](misc/wpforms-confirmations.png)
- The form uses the smart tag `{field_id="0"}` referring to the First and Last name
- Sample confirmation message: "Thanks Pravat Bhusal for contacting us! We will be in touch with you shortly."

### Elementor with WPForms
Elementor uses WPForms to create the form elements. We can add our Simple Contact Form that we created from the previous step into our website.

Search for "form" and find the "WPForms" element in Elementor:

![wpform elementor](misc/elementor-search-form.png)

Select the Contact Form that we created, then it should load up on the page:

![contact form on page](misc/elementor-contact-form.png)

Now if you publish your website and go to the Contact page, you'll see the Contact Form that we created. Let's fill out some info in the form:

![contact form filled](misc/page-contact-form-filled.png)

And if you click submit, you'll see the confirmation text we had setup:

![contact form confirmed](misc/page-contact-form-confirmed.png)

