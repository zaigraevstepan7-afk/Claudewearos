package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f4135a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4136b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f4137c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4138d;

    public a1(a aVar, String str, Object[] objArr) {
        this.f4135a = aVar;
        this.f4136b = str;
        this.f4137c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < '\ud800') {
            this.f4138d = cCharAt;
            return;
        }
        int i10 = cCharAt & '\u1fff';
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < '\ud800') {
                this.f4138d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & '\u1fff') << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }
}
