package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d extends BasePendingResult implements e {
    private final com.google.android.gms.common.api.i api;
    private final com.google.android.gms.common.api.c clientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.p pVar) {
        super(pVar);
        com.google.android.gms.common.internal.e0.j(pVar, "GoogleApiClient must not be null");
        com.google.android.gms.common.internal.e0.j(iVar, "Api must not be null");
        this.clientKey = iVar.f3496b;
        this.api = iVar;
    }

    public abstract void doExecute(com.google.android.gms.common.api.b bVar);

    public final com.google.android.gms.common.api.i getApi() {
        return this.api;
    }

    public final com.google.android.gms.common.api.c getClientKey() {
        return this.clientKey;
    }

    public final void run(com.google.android.gms.common.api.b bVar) throws DeadObjectException {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e10) {
            setFailedResult(new Status(8, e10.getLocalizedMessage(), null, null));
            throw e10;
        } catch (RemoteException e11) {
            setFailedResult(new Status(8, e11.getLocalizedMessage(), null, null));
        }
    }

    public final void setFailedResult(Status status) {
        com.google.android.gms.common.internal.e0.a("Failed result must not be success", !status.b());
        com.google.android.gms.common.api.t tVarCreateFailedResult = createFailedResult(status);
        setResult((d) tVarCreateFailedResult);
        onSetFailedResult(tVarCreateFailedResult);
    }

    public void onSetFailedResult(com.google.android.gms.common.api.t tVar) {
    }
}
