package com.example.android.miwok;

/**
 * {@link Word} shows a vocabulary word that the user wants to learn.
 * It contains a default translation and the Miwok translation for that word.
 */
public class Word {

    /**
     * Default translation for the word.
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar.
     * @param miwokTranslation   is the word in the Miwok language.
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

}
