package u6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends Binder implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f16710a;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f16710a = multiInstanceInvalidationService;
        attachInterface(this, e.f16693u);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = e.f16693u;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        d dVar = null;
        d dVar2 = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                r(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(d.f16688t);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.f16685a = strongBinder;
                    dVar2 = cVar;
                } else {
                    dVar2 = (d) iInterfaceQueryLocalInterface;
                }
            }
            int i12 = parcel.readInt();
            fj.l.f(dVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f16710a;
            synchronized (multiInstanceInvalidationService.f1215c) {
                multiInstanceInvalidationService.f1215c.unregister(dVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(d.f16688t);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof d)) {
                c cVar2 = new c();
                cVar2.f16685a = strongBinder2;
                dVar = cVar2;
            } else {
                dVar = (d) iInterfaceQueryLocalInterface2;
            }
        }
        String string = parcel.readString();
        fj.l.f(dVar, "callback");
        int i13 = 0;
        if (string != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f16710a;
            synchronized (multiInstanceInvalidationService2.f1215c) {
                try {
                    int i14 = multiInstanceInvalidationService2.f1213a + 1;
                    multiInstanceInvalidationService2.f1213a = i14;
                    if (multiInstanceInvalidationService2.f1215c.register(dVar, Integer.valueOf(i14))) {
                        multiInstanceInvalidationService2.f1214b.put(Integer.valueOf(i14), string);
                        i13 = i14;
                    } else {
                        multiInstanceInvalidationService2.f1213a--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i13);
        return true;
    }

    @Override // u6.e
    public final void r(int i10, String[] strArr) {
        fj.l.f(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f16710a;
        synchronized (multiInstanceInvalidationService.f1215c) {
            String str = (String) multiInstanceInvalidationService.f1214b.get(Integer.valueOf(i10));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.f1215c.beginBroadcast();
            for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f1215c.getBroadcastCookie(i11);
                    fj.l.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f1214b.get(num);
                    if (i10 != iIntValue && str.equals(str2)) {
                        try {
                            ((d) multiInstanceInvalidationService.f1215c.getBroadcastItem(i11)).c(strArr);
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Error invoking a remote callback", e10);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f1215c.finishBroadcast();
                }
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
