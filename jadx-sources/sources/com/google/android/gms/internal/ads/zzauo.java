package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzauo implements Runnable {
    private zzauo() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzauq.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzauq.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzauq.zzb;
        } catch (Throwable th2) {
            zzauq.zzb.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ zzauo(zzaup zzaupVar) {
    }
}
