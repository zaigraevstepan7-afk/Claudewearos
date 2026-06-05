package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzx implements zzv {
    private zzx() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzv
    public final zzs zza(String str) {
        return new zzu(Pattern.compile(str));
    }
}
