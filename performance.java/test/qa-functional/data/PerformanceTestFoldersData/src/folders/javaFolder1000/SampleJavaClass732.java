/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package folders.javaFolder1000;

/**
 * Implementation of the logic for the Anagram Game application.
 */
public class SampleJavaClass732 extends Object {

    private static final String[] WORD_LIST = {
        "abstraction",
        "ambiguous",
        "arithmetic",
        "backslash",
        "bitmap",
        "circumstance",
        "combination",
        "consequently",
        "traditional"};

    private static final String[] SCRAMBLED_WORD_LIST = {
        "batsartcoin",
        "maibuguos",
        "ratimhteci",
        "abkclssha",
        "ibmtpa",
        "iccrmutsnaec",
        "ocbmnitaoni",
        "ocsnqeeutnyl",
        "rtdatioialn"
    };

    /**
     * Gets the word at a given index.
     *
     * @param idx index of required word
     * @return word at that index in its natural form
     */
    public String getWord(int idx) {
        return WORD_LIST[idx];
    }

    /**
     * Gets the word at a given index in its scrambled form.
     *
     * @param idx index of required word
     * @return word at that index in its scrambled form
     */
    public String getScrambledWord(int idx) {
        return SCRAMBLED_WORD_LIST[idx];
    }

    /**
     * Gets the number of words in the library.
     *
     * @return the total number of plain/scrambled word pairs in the library
     */
    public int getSize() {
        return WORD_LIST.length;
    }

    /**
     * Checks whether a user's guess for a word at the given index is correct.
     *
     * @param idx index of the word guessed
     * @param userGuess the user's guess for the actual word
     * @return true if the guess was correct; false otherwise
     */
    public boolean isCorrect(int idx, String userGuess) {
        return userGuess.equals(getWord(idx));
    }
}
