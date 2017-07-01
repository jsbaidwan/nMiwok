package com.example.jaspreetsingh.nmiwok;

/**
 * Created by jaspreet.singh on 27-06-2017.
 */

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image Resource for the word */
    private int mImageResource;

    /**
     * Create a new Word object for phrase activity as it only require two parameters.
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
    * Create a new Word object for color, number, family activity as it requires three parameters.
    *
    * @param defaultTranslation is the word in a language that the user is already familiar with
    *                      (such as English)
    * @param miwokTranslation is the word in the Miwok language
    *
    *  @param imageResource is the image representation in Miwok words
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResource = imageResource;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    /**
     * Ge the Image Resourse ID of the word
     */
    public int getImageResourceId() {
        return mImageResource;
    }

}