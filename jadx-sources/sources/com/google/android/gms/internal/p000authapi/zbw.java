package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import hd.f;
import hd.i;
import hd.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zbw extends zba implements IInterface {
    public zbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbm zbmVar, f fVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbmVar);
        zbc.zbc(parcelZba, fVar);
        zbb(1, parcelZba);
    }

    public final void zbd(zbp zbpVar, i iVar, String str) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbpVar);
        zbc.zbc(parcelZba, iVar);
        parcelZba.writeString(str);
        zbb(4, parcelZba);
    }

    public final void zbe(zbr zbrVar, j jVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbrVar);
        zbc.zbc(parcelZba, jVar);
        zbb(3, parcelZba);
    }

    public final void zbf(com.google.android.gms.common.api.internal.j jVar, String str) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, jVar);
        parcelZba.writeString(str);
        zbb(2, parcelZba);
    }
}
