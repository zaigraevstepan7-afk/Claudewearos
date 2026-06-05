package com.bumptech.glide.load;

import ob.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* renamed from: a, reason: collision with root package name */
    public final boolean f3426a;

    ImageHeaderParser$ImageType(boolean z2) {
        this.f3426a = z2;
    }

    public boolean hasAlpha() {
        return this.f3426a;
    }

    public boolean isWebp() {
        int i10 = a.f12443a[ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }
}
