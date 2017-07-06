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

    /** Audio Resource for the word */
    private int mAudioResource;


    /** Constant that represent no image state
     *  Its value is -1 because it's out of the range of possible valid resource ID
     *  */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object for phrase activity as it only require two parameters.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResource = audioResource;

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
    public Word(String defaultTranslation, String miwokTranslation, int imageResource, int audioResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResource = imageResource;
        mAudioResource = audioResource;
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
     * Get the Image Resourse ID of the word
     */
    public int getImageResourceId() {
        return mImageResource;
    }
    /**
     * Get the Audio Resource ID of the word
     */
    public int getAudioResourceId()   {return mAudioResource; }
    /**
     *  Returns whether or not there is an image for this Word
     */
    public boolean hasImage()   {
        return mImageResource != NO_IMAGE_PROVIDED;
    }

}