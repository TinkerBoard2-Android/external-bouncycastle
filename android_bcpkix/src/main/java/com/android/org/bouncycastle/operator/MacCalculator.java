/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.operator;

import java.io.OutputStream;

import com.android.org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public interface MacCalculator
{
    AlgorithmIdentifier getAlgorithmIdentifier();

    /**
     * Returns a stream that will accept data for the purpose of calculating
     * the MAC for later verification. Use org.bouncycastle.util.io.TeeOutputStream if you want to accumulate
     * the data on the fly as well.
     *
     * @return an OutputStream
     */
    OutputStream getOutputStream();

    /**
     * Return the calculated MAC based on what has been written to the stream.
     *
     * @return calculated MAC.
     */
    byte[] getMac();


    /**
     * Return the key used for calculating the MAC.
     *
     * @return the MAC key.
     */
    GenericKey getKey();
}