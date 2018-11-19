package com.team7.cmput301.android.theirisproject;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;
import com.team7.cmput301.android.theirisproject.R;
import com.team7.cmput301.android.theirisproject.activity.RegisterActivity;

/**
 * Contains register tests for RegisterActivity
 *
 *
 * @author Jmmxp
 * @see RegisterActivity
 */
public class RegisterActivityTest2 extends ActivityInstrumentationTestCase2<RegisterActivity> {

    // TODO: The tests in here do not work due to Solo ClassNotFound exceptions and the like
    // We have to decide if we want to use Robotium or Espresso

    private Solo solo;

    public RegisterActivityTest2() {
        super(RegisterActivity.class);
    }

//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//        solo = new Solo(getInstrumentation(), getActivity());
//    }
//
//    @Override
//    protected void tearDown() throws Exception {
//        super.tearDown();
//        solo.finishOpenedActivities();
//    }
//
//    public void testActivity() {
//        String activityName = RegisterActivity.class.getSimpleName();
//        solo.assertCurrentActivity("Wrong activity found, should be " + activityName, activityName);
//    }
//
//    // Test registration when not all fields have been filled out
//    public void testRegisterIncomplete() {
//        Button registerButton = (Button) solo.getView(R.id.register_button);
//
//        solo.clickOnView(registerButton);
//
//        assertTrue(solo.waitForText(getString(R.string.register_failure)));
//
//        // Try registering with only the name field filled out
//        EditText nameEditText = (EditText) solo.getView(R.id.name_edit_text);
//        solo.enterText(nameEditText, "John Doe");
//
//        solo.clickOnView(registerButton);
//
//        assertTrue(solo.waitForText(getString(R.string.register_success)));
//    }
//
    // Test registration when all fields have been filled out
//    public void testRegisterComplete() {
//        Button registerButton = (Button) solo.getView(R.id.register_button);
//
//
//        // Try registering with only the name field filled out
//        EditText nameEditText = (EditText) solo.getView(R.id.name_edit_text);
//        EditText passwordEditText = (EditText) solo.getView(R.id.password_edit_text);
//        EditText emailEditText = (EditText) solo.getView(R.id.email_edit_text);
//        EditText phoneEditText = (EditText) solo.getView(R.id.phone_edit_text);
//
//        solo.enterText(nameEditText, "John Doe");
//        solo.enterText(passwordEditText, "badpassword");
//        solo.enterText(emailEditText, "johndoe@gmail.com");
//        solo.enterText(phoneEditText, "123-456-7890");
//
//        solo.clickOnView(registerButton);
//
//        assertTrue(solo.waitForText(getString(R.string.register_failure)) || solo.waitForText(getString(R.string.register_incomplete)));
//    }
//
//    private String getString(int stringId) {
//        return getActivity().getString(stringId);
//    }

}
