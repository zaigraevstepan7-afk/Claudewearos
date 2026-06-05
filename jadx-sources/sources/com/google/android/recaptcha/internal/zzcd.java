package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import qj.b0;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzcd {
    private final WebView zza;
    private final z zzb;

    public zzcd(WebView webView, z zVar) {
        this.zza = webView;
        this.zzb = zVar;
    }

    public final void zzb(String str, String... strArr) {
        b0.w(this.zzb, null, new zzcc((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
