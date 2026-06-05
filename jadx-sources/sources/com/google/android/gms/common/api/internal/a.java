package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3498a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.i f3499b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.e f3500c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3501d;

    public a(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.e eVar, String str) {
        this.f3499b = iVar;
        this.f3500c = eVar;
        this.f3501d = str;
        this.f3498a = Arrays.hashCode(new Object[]{iVar, eVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return com.google.android.gms.common.internal.e0.l(this.f3499b, aVar.f3499b) && com.google.android.gms.common.internal.e0.l(this.f3500c, aVar.f3500c) && com.google.android.gms.common.internal.e0.l(this.f3501d, aVar.f3501d);
    }

    public final int hashCode() {
        return this.f3498a;
    }
}
