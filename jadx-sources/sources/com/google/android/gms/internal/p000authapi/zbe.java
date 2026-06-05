package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.l;
import fd.d;
import mh.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zbe extends l {
    private final d zba;

    public zbe(Context context, Looper looper, i iVar, d dVar, n nVar, o oVar) {
        super(context, looper, 68, iVar, nVar, oVar);
        dVar = dVar == null ? d.f6729c : dVar;
        g gVar = new g(12, false);
        gVar.f11707b = Boolean.FALSE;
        d dVar2 = d.f6729c;
        dVar.getClass();
        gVar.f11707b = Boolean.valueOf(dVar.f6730a);
        gVar.f11708c = dVar.f6731b;
        gVar.f11708c = zbat.zba();
        this.zba = new d(gVar);
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof zbf ? (zbf) iInterfaceQueryLocalInterface : new zbf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        d dVar = this.zba;
        dVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", dVar.f6730a);
        bundle.putString("log_session_id", dVar.f6731b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
