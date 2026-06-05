package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzcbq {
    private static final AtomicInteger zza = new AtomicInteger(0);
    private static final AtomicInteger zzb = new AtomicInteger(0);

    public static AtomicInteger zzD() {
        return zza;
    }

    public static AtomicInteger zzE() {
        return zzb;
    }

    public static int zzs() {
        return zza.get();
    }

    public static int zzu() {
        return zzb.get();
    }

    public abstract long zzA();

    public abstract long zzB();

    public abstract Integer zzC();

    public abstract void zzF(Uri[] uriArr, String str);

    public abstract void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z2);

    public abstract void zzH();

    public abstract void zzI(long j);

    public abstract void zzJ(int i10);

    public abstract void zzK(int i10);

    public abstract void zzL(zzcbp zzcbpVar);

    public abstract void zzM(int i10);

    public abstract void zzN(int i10);

    public abstract void zzO(boolean z2);

    public abstract void zzP(Integer num);

    public abstract void zzQ(boolean z2);

    public abstract void zzR(int i10);

    public abstract void zzS(Surface surface, boolean z2);

    public abstract void zzT(float f10, boolean z2);

    public abstract void zzU();

    public abstract boolean zzV();

    public abstract int zzr();

    public abstract int zzt();

    public abstract long zzv();

    public abstract long zzw();

    public abstract long zzx();

    public abstract long zzy();

    public abstract long zzz();
}
