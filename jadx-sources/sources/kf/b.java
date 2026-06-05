package kf;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends i0 {
    public final /* synthetic */ d A;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ IBinder f9554z;

    public b(d dVar, IBinder iBinder) {
        this.f9554z = iBinder;
        this.A = dVar;
    }

    @Override // kf.i0
    public final void b() throws RemoteException {
        e eVar = (e) this.A.f9558b;
        eVar.f9572n = (IInterface) eVar.f9568i.a(this.f9554z);
        h0 h0Var = eVar.f9561b;
        int i10 = 0;
        h0Var.b("linkToDeath", new Object[0]);
        try {
            eVar.f9572n.asBinder().linkToDeath(eVar.f9569k, 0);
        } catch (RemoteException e10) {
            h0Var.a(e10, "linkToDeath failed", new Object[0]);
        }
        eVar.f9566g = false;
        ArrayList arrayList = eVar.f9563d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        eVar.f9563d.clear();
    }
}
