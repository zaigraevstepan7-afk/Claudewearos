package com.google.android.gms.internal.auth;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import sd.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbz extends c {
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            Log.e("AUTH", "Error serializing object.", e10);
            return null;
        }
    }
}
