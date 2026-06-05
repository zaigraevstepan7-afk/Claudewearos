package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public final String f3401a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3402b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f3403c;

    public Purchase(String str, String str2) {
        this.f3401a = str;
        this.f3402b = str2;
        this.f3403c = new JSONObject(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f3401a, purchase.f3401a) && TextUtils.equals(this.f3402b, purchase.f3402b);
    }

    public final int hashCode() {
        return this.f3401a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f3401a));
    }
}
