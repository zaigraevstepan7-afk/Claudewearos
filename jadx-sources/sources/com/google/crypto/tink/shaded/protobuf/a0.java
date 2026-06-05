package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f4133a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4134b;

    static {
        Charset.forName("US-ASCII");
        f4133a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4134b = bArr;
        ByteBuffer.wrap(bArr);
        androidx.datastore.preferences.protobuf.j.h(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
