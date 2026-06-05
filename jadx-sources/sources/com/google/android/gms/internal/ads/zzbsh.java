package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import mc.n;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbsh implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsj zza;

    public zzbsh(zzbsj zzbsjVar) {
        this.zza = zzbsjVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        zzbsj zzbsjVar = this.zza;
        Intent intentZzb = zzbsjVar.zzb();
        r0 r0Var = n.D.f11577c;
        r0.q(zzbsjVar.zzb, intentZzb);
    }
}
