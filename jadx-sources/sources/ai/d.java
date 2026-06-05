package ai;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import rg.h0;
import rg.z;
import wh.a0;
import wh.s;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f503c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f501a = i10;
        this.f502b = obj;
        this.f503c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i10;
        ComponentName componentNameStartService;
        switch (this.f501a) {
            case 0:
                e eVar = (e) this.f502b;
                g gVar = (g) this.f503c;
                q qVar = eVar.f507b;
                synchronized (qVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = qVar.f576a.openFileOutput(qVar.f577b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(gVar.f516a.toString().getBytes("UTF-8"));
                    } finally {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
                return null;
            case 1:
                z zVar = (z) this.f502b;
                wg.h hVar = (wg.h) this.f503c;
                zVar.getClass();
                rg.h hVar2 = hVar.f19305a;
                ug.e eVarW = zVar.f14490a;
                r rVarC = null;
                rg.h hVarC = hVar2;
                boolean z2 = false;
                while (true) {
                    if (eVarW.isEmpty()) {
                        rg.o oVar = (rg.o) zVar.f14490a.i(hVar2);
                        if (oVar == null) {
                            oVar = new rg.o(zVar.f14496g);
                            zVar.f14490a = zVar.f14490a.y(hVar2, oVar);
                        } else if (rVarC == null) {
                            rVarC = oVar.c(rg.h.f14414d);
                        }
                        wg.a aVar = new wg.a(new zg.l(rVarC != null ? rVarC : zg.j.f20603e, hVar.f19306b.f19304e), rVarC != null, false);
                        h0 h0Var = zVar.f14491b;
                        h0Var.getClass();
                        return oVar.f(hVar, new q5.b(5, hVar2, h0Var), aVar).f19309c.m();
                    }
                    rg.o oVar2 = (rg.o) eVarW.f17072a;
                    if (oVar2 != null) {
                        if (rVarC == null) {
                            rVarC = oVar2.c(hVarC);
                        }
                        z2 = z2 || oVar2.g();
                    }
                    eVarW = eVarW.w(hVarC.isEmpty() ? zg.c.b("") : hVarC.z());
                    hVarC = hVarC.C();
                }
                break;
            case 2:
                Context context = (Context) this.f502b;
                Intent intent = (Intent) this.f503c;
                s sVarI = s.i();
                sVarI.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) sVarI.f19382d).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (sVarI) {
                    try {
                        str = (String) sVarI.f19379a;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        sVarI.f19379a = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        sVarI.f19379a = serviceInfo.name;
                                    }
                                    str = (String) sVarI.f19379a;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            }
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (sVarI.l(context)) {
                        componentNameStartService = a0.c(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i10 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            default:
                zh.b bVar = (zh.b) this.f502b;
                ug.f fVar = (ug.f) this.f503c;
                m mVar = bVar.f20630h;
                synchronized (mVar.f551b) {
                    SharedPreferences.Editor editorEdit = mVar.f550a.edit();
                    fVar.getClass();
                    editorEdit.putLong("fetch_timeout_in_seconds", 60L).putLong("minimum_fetch_interval_in_seconds", fVar.f17074a).commit();
                }
                return null;
        }
    }
}
