package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class HomePage {
    private static final String PAGE_URL = "https://ultimateqa.com/automation";

    private final WebDriver driver;

    @FindBy(linkText = "Fake Landing Page")
    private WebElement fakeLandingPage;

    @FindBy(linkText = "Fake Landing Page")
    private WebElement fakePricingPage;

    private static final Map<String, By> websitePaths = Map.of(
            "FakeLandingPage", By.cssSelector("#post-507 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_section_specialty > div > div.et_pb_column.et_pb_column_3_4.et_pb_column_0.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough > div > div > div > div > ul > li:nth-child(2) > a"),
            "FakePricingPage", By.cssSelector("#post-507 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_section_specialty > div > div.et_pb_column.et_pb_column_3_4.et_pb_column_0.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough > div > div > div > div > ul > li:nth-child(3) > a"),
            "FirstViewCourses", By.cssSelector("#post-4816 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_0.et_animated.et_pb_with_background.et_section_regular > div > div.et_pb_column.et_pb_column_1_2.et_pb_column_0.et_pb_css_mix_blend_mode_passthrough > div.et_pb_button_module_wrapper.et_pb_button_0_wrapper.et_pb_module > a"),
            "SecondViewCourses", By.cssSelector("#post-4816 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_section_specialty > div > div.et_pb_column.et_pb_column_1_3.et_pb_column_2.et_pb_css_mix_blend_mode_passthrough.et_pb_column_single > div.et_pb_button_module_wrapper.et_pb_button_1_wrapper.et_pb_button_alignment_left.et_pb_module > a"),
            "WebDevelopment", By.cssSelector("#post-4816 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_section_specialty > div > div.et_pb_column.et_pb_column_2_3.et_pb_column_3.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough.et-last-child > div > div.et_pb_column.et_pb_column_1_3.et_pb_column_inner.et_pb_column_inner_0.et_pb_column_1_2 > div.et_pb_module.et_pb_blurb.et_pb_blurb_0.et_animated.et_pb_text_align_left.et_pb_blurb_position_left.et_pb_bg_layout_light > div > div.et_pb_blurb_container > h4 > a"),
            "Python", By.cssSelector("#post-4816 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_section_specialty > div > div.et_pb_column.et_pb_column_2_3.et_pb_column_3.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough.et-last-child > div > div.et_pb_column.et_pb_column_1_3.et_pb_column_inner.et_pb_column_inner_0.et_pb_column_1_2 > div.et_pb_module.et_pb_blurb.et_pb_blurb_1.et_animated.et_pb_text_align_left.et_pb_blurb_position_left.et_pb_bg_layout_light > div > div.et_pb_blurb_container > h4 > a"),
            "UXDesign", By.cssSelector("#post-4816 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_section_specialty > div > div.et_pb_column.et_pb_column_2_3.et_pb_column_3.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough.et-last-child > div > div.et_pb_column.et_pb_column_1_3.et_pb_column_inner.et_pb_column_inner_0.et_pb_column_1_2 > div.et_pb_module.et_pb_blurb.et_pb_blurb_2.et_animated.et_pb_text_align_left.et_pb_blurb_position_left.et_pb_bg_layout_light > div > div.et_pb_blurb_container > h4 > a"),
            "DatabaseDesign", By.cssSelector("#post-4816 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_section_specialty > div > div.et_pb_column.et_pb_column_2_3.et_pb_column_3.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough.et-last-child > div > div.et_pb_column.et_pb_column_1_3.et_pb_column_inner.et_pb_column_inner_0.et_pb_column_1_2 > div.et_pb_module.et_pb_blurb.et_pb_blurb_3.et_animated.et_pb_text_align_left.et_pb_blurb_position_left.et_pb_bg_layout_light > div > div.et_pb_blurb_container > h4 > a"),
            "Javascript", By.cssSelector("#post-4816 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_section_specialty > div > div.et_pb_column.et_pb_column_2_3.et_pb_column_3.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough.et-last-child > div > div.et_pb_column.et_pb_column_1_3.et_pb_column_inner.et_pb_column_inner_1.et_pb_column_1_2.et-last-child > div.et_pb_module.et_pb_blurb.et_pb_blurb_4.et_animated.et_pb_text_align_left.et_pb_blurb_position_left.et_pb_bg_layout_light > div > div.et_pb_blurb_container > h4 > a"),
            "HTML&CSS", By.cssSelector("#post-4816 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_section_specialty > div > div.et_pb_column.et_pb_column_2_3.et_pb_column_3.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough.et-last-child > div > div.et_pb_column.et_pb_column_1_3.et_pb_column_inner.et_pb_column_inner_1.et_pb_column_1_2.et-last-child > div.et_pb_module.et_pb_blurb.et_pb_blurb_5.et_animated.et_pb_text_align_left.et_pb_blurb_position_left.et_pb_bg_layout_light > div > div.et_pb_blurb_container > h4 > a"),
            "IntroToCoding", By.cssSelector("#post-4816 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_section_specialty > div > div.et_pb_column.et_pb_column_2_3.et_pb_column_3.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough.et-last-child > div > div.et_pb_column.et_pb_column_1_3.et_pb_column_inner.et_pb_column_inner_1.et_pb_column_1_2.et-last-child > div.et_pb_module.et_pb_blurb.et_pb_blurb_6.et_animated.et_pb_text_align_left.et_pb_blurb_position_left.et_pb_bg_layout_light > div > div.et_pb_blurb_container > h4 > a"),
            "Apps&Games", By.cssSelector("#post-4816 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_section_specialty > div > div.et_pb_column.et_pb_column_2_3.et_pb_column_3.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough.et-last-child > div > div.et_pb_column.et_pb_column_1_3.et_pb_column_inner.et_pb_column_inner_1.et_pb_column_1_2.et-last-child > div.et_pb_module.et_pb_blurb.et_pb_blurb_7.et_animated.et_pb_text_align_left.et_pb_blurb_position_left.et_pb_bg_layout_light > div > div.et_pb_blurb_container > h4 > a"),
            "FreeTrial", By.cssSelector("#post-5050 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_0.et_animated.et_pb_with_background.et_section_regular > div.et_pb_row.et_pb_row_1.et_pb_gutters2 > div.et_pb_column.et_pb_column_1_3.et_pb_column_1.et_pb_css_mix_blend_mode_passthrough > div > div > div > div.et_pb_button_wrapper > a"),
            "Basic", By.cssSelector("#post-5050 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_0.et_animated.et_pb_with_background.et_section_regular > div.et_pb_row.et_pb_row_1.et_pb_gutters2 > div.et_pb_column.et_pb_column_1_3.et_pb_column_2.et_pb_css_mix_blend_mode_passthrough > div > div > div > div.et_pb_button_wrapper > a"),
            "Enterprise", By.cssSelector("#post-5050 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_0.et_animated.et_pb_with_background.et_section_regular > div.et_pb_row.et_pb_row_1.et_pb_gutters2 > div.et_pb_column.et_pb_column_1_3.et_pb_column_3.et_pb_css_mix_blend_mode_passthrough.et-last-child > div > div > div > div.et_pb_button_wrapper > a"),
            "BrowseDocs", By.cssSelector("#post-5050 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_1.et_pb_with_background.et_section_regular > div.et_pb_row.et_pb_row_4 > div > div.et_pb_button_module_wrapper.et_pb_button_0_wrapper.et_pb_button_alignment_center.et_pb_module > a"),
            "SignUpToday", By.cssSelector("#post-5050 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_4.et_pb_with_background.et_section_regular > div > div.et_pb_column.et_pb_column_1_3.et_pb_column_14.et_pb_css_mix_blend_mode_passthrough.et-last-child > div > a")
    );
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void navigateFakeLandingPage() {
        fakeLandingPage.click();
    }

    public void navigateFakePricingPage() {
        fakePricingPage.click();
    }

    public void fillOutField(String field, String text) {
        driver.findElement(websitePaths.get(field)).sendKeys(text);
    }

    public void clickButton(String button) {
        driver.findElement(websitePaths.get(button)).click();
    }

    public String getPageUrl(){return driver.getCurrentUrl();}
    public void closePage() {
        driver.quit();
    }

}
