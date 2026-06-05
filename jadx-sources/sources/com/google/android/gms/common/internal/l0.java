package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f3667d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f3668a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3669b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3670c;

    public l0(String str, String str2, boolean z2) {
        e0.e(str);
        this.f3668a = str;
        e0.e(str2);
        this.f3669b = str2;
        this.f3670c = z2;
    }

    public final Intent a(Context context) {
        Bundle bundleCall;
        String str = this.f3668a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f3670c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(f3667d, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f3669b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return e0.l(this.f3668a, l0Var.f3668a) && e0.l(this.f3669b, l0Var.f3669b) && e0.l(null, null) && this.f3670c == l0Var.f3670c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3668a, this.f3669b, null, 4225, Boolean.valueOf(this.f3670c)});
    }

    public final String toString() {
        String str = this.f3668a;
        if (str != null) {
            return str;
        }
        e0.i(null);
        throw null;
    }
}
