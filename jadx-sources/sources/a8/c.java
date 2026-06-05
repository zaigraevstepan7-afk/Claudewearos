package a8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import qc.i0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196a;

    /* renamed from: b, reason: collision with root package name */
    public Object f197b;

    public void a() {
        switch (this.f196a) {
            case 1:
                mh.g gVar = FirebaseInstanceId.j;
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Connectivity change received registered");
                }
                ((mh.i) this.f197b).a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                break;
            default:
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity change received registered");
                }
                ((FirebaseMessaging) ((mh.i) this.f197b).f11718e).f4295c.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                break;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f196a) {
            case 0:
                if (intent != null) {
                    ((d) this.f197b).g(intent);
                    return;
                }
                return;
            case 1:
                mh.i iVar = (mh.i) this.f197b;
                if (iVar == null) {
                    return;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) iVar.a().getSystemService("connectivity");
                NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                mh.i iVar2 = (mh.i) this.f197b;
                ((FirebaseInstanceId) iVar2.f11718e).getClass();
                FirebaseInstanceId.d(iVar2, 0L);
                ((mh.i) this.f197b).a().unregisterReceiver(this);
                this.f197b = null;
                return;
            case 2:
                i0 i0Var = (i0) this.f197b;
                synchronized (i0Var) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : i0Var.f13374b.entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 3:
                r0 r0Var = (r0) this.f197b;
                if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
                    r0Var.f13450e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        r0Var.f13450e = false;
                        return;
                    }
                    return;
                }
            default:
                mh.i iVar3 = (mh.i) this.f197b;
                if (iVar3 != null && iVar3.b()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    mh.i iVar4 = (mh.i) this.f197b;
                    ((FirebaseMessaging) iVar4.f11718e).getClass();
                    FirebaseMessaging.b(iVar4, 0L);
                    ((FirebaseMessaging) ((mh.i) this.f197b).f11718e).f4295c.unregisterReceiver(this);
                    this.f197b = null;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.f196a = i10;
        this.f197b = obj;
    }
}
