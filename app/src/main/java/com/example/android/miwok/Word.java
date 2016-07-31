package com.example.android.miwok;

/**
 * Created by danle on 7/24/2016.
 */
public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }






    /**
     +     * Get the default translation of the word.
     +     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     +     * Get the Miwok translation of the word.
     +     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }




    /**
          * Return the image resource ID of the word.
          */
        public int getImageResourceId() {
               return mImageResourceId;
            }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the image associated with the image with the word
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;



    }






    public Word(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }


}
