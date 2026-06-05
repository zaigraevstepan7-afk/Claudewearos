package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class zzfm implements Iterable {
    private final zzfe zza = zzfe.zza();

    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb2 = new StringBuilder("[");
        boolean z2 = true;
        while (it.hasNext()) {
            if (!z2) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z2 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }
}
