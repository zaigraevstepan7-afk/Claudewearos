package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    p0 zza;
    final Handler zzb;
    protected d zzc;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private final Context zzl;
    private final Looper zzm;
    private final m zzn;
    private final nd.f zzo;
    private p zzr;
    private IInterface zzs;
    private h0 zzu;
    private final b zzw;
    private final c zzx;
    private final int zzy;
    private final String zzz;
    private static final nd.d[] zze = new nd.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    private volatile String zzk = null;
    private final Object zzp = new Object();
    private final Object zzq = new Object();
    private final ArrayList zzt = new ArrayList();
    private int zzv = 1;
    private nd.b zzB = null;
    private boolean zzC = false;
    private volatile k0 zzD = null;
    protected AtomicInteger zzd = new AtomicInteger(0);

    public f(Context context, Looper looper, o0 o0Var, nd.f fVar, int i10, b bVar, c cVar, String str) {
        e0.j(context, "Context must not be null");
        this.zzl = context;
        e0.j(looper, "Looper must not be null");
        this.zzm = looper;
        e0.j(o0Var, "Supervisor must not be null");
        this.zzn = o0Var;
        e0.j(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzb = new f0(this, looper);
        this.zzy = i10;
        this.zzw = bVar;
        this.zzx = cVar;
        this.zzz = str;
    }

    public static void zzj(f fVar, k0 k0Var) {
        fVar.zzD = k0Var;
        if (fVar.usesClientTelemetry()) {
            j jVar = k0Var.f3666d;
            s sVarB = s.b();
            t tVar = jVar == null ? null : jVar.f3649a;
            synchronized (sVarB) {
                if (tVar == null) {
                    sVarB.f3703a = s.f3702c;
                    return;
                }
                t tVar2 = (t) sVarB.f3703a;
                if (tVar2 == null || tVar2.f3704a < tVar.f3704a) {
                    sVarB.f3703a = tVar;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(f fVar, int i10) {
        int i11;
        int i12;
        synchronized (fVar.zzp) {
            i11 = fVar.zzv;
        }
        if (i11 == 3) {
            fVar.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = fVar.zzb;
        handler.sendMessage(handler.obtainMessage(i12, fVar.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(f fVar, int i10, int i11, IInterface iInterface) {
        synchronized (fVar.zzp) {
            try {
                if (fVar.zzv != i10) {
                    return false;
                }
                fVar.a(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(f fVar) throws ClassNotFoundException {
        if (fVar.zzC || TextUtils.isEmpty(fVar.getServiceDescriptor()) || TextUtils.isEmpty(fVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(fVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void a(int i10, IInterface iInterface) {
        p0 p0Var;
        e0.b((i10 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                if (i10 == 1) {
                    h0 h0Var = this.zzu;
                    if (h0Var != null) {
                        m mVar = this.zzn;
                        String str = this.zza.f3688a;
                        e0.i(str);
                        String str2 = this.zza.f3689b;
                        zze();
                        mVar.b(str, str2, h0Var, this.zza.f3690c);
                        this.zzu = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    h0 h0Var2 = this.zzu;
                    if (h0Var2 != null && (p0Var = this.zza) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + p0Var.f3688a + " on " + p0Var.f3689b);
                        m mVar2 = this.zzn;
                        String str3 = this.zza.f3688a;
                        e0.i(str3);
                        String str4 = this.zza.f3689b;
                        zze();
                        mVar2.b(str3, str4, h0Var2, this.zza.f3690c);
                        this.zzd.incrementAndGet();
                    }
                    h0 h0Var3 = new h0(this, this.zzd.get());
                    this.zzu = h0Var3;
                    p0 p0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new p0(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new p0(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = p0Var2;
                    if (p0Var2.f3690c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f3688a)));
                    }
                    m mVar3 = this.zzn;
                    String str5 = this.zza.f3688a;
                    e0.i(str5);
                    if (!mVar3.c(new l0(str5, this.zza.f3689b, this.zza.f3690c), h0Var3, zze(), getBindServiceExecutor())) {
                        p0 p0Var3 = this.zza;
                        Log.w("GmsClient", "unable to connect to service: " + p0Var3.f3688a + " on " + p0Var3.f3689b);
                        zzl(16, null, this.zzd.get());
                    }
                } else if (i10 == 4) {
                    e0.i(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iD = this.zzo.d(this.zzl, getMinApkVersion());
        if (iD == 0) {
            connect(new s(this));
        } else {
            a(1, null);
            triggerNotAvailable(new s(this), iD, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(d dVar) {
        e0.j(dVar, "Connection progress callbacks cannot be null.");
        this.zzc = dVar;
        a(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i10 = 0; i10 < size; i10++) {
                    b0 b0Var = (b0) this.zzt.get(i10);
                    synchronized (b0Var) {
                        b0Var.f3620a = null;
                    }
                }
                this.zzt.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        a(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        p pVar;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            pVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (pVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((d0) pVar).asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.zzh;
            printWriterAppend.println(j + " " + simpleDateFormat.format(new Date(j)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j4 = this.zzg;
            printWriterAppend2.println(j4 + " " + simpleDateFormat.format(new Date(j4)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) wd.a.D(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j10 = this.zzj;
            printWriterAppend3.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public nd.d[] getApiFeatures() {
        return zze;
    }

    public final nd.d[] getAvailableFeatures() {
        k0 k0Var = this.zzD;
        if (k0Var == null) {
            return null;
        }
        return k0Var.f3664b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        p0 p0Var;
        if (!isConnected() || (p0Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return p0Var.f3689b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return nd.f.f12279a;
    }

    public void getRemoteService(n nVar, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i10 = nd.f.f12279a;
        Scope[] scopeArr = k.H;
        Bundle bundle = new Bundle();
        int i11 = this.zzy;
        nd.d[] dVarArr = k.I;
        k kVar = new k(6, i11, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        kVar.f3659d = this.zzl.getPackageName();
        kVar.f3662z = getServiceRequestExtraArgs;
        if (set != null) {
            kVar.f3661f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            kVar.A = account;
            if (nVar != null) {
                kVar.f3660e = nVar.asBinder();
            }
        } else if (requiresAccount()) {
            kVar.A = getAccount();
        }
        kVar.B = zze;
        kVar.C = getApiFeatures();
        if (usesClientTelemetry()) {
            kVar.F = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    p pVar = this.zzr;
                    if (pVar != null) {
                        ((d0) pVar).n(new g0(this, this.zzd.get()), kVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                e0.j(iInterface, "Client is connected but service is null");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                p pVar = this.zzr;
                if (pVar == null) {
                    return null;
                }
                return ((d0) pVar).asBinder();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public j getTelemetryConfiguration() {
        k0 k0Var = this.zzD;
        if (k0Var == null) {
            return null;
        }
        return k0Var.f3666d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z2;
        synchronized (this.zzp) {
            z2 = this.zzv == 4;
        }
        return z2;
    }

    public boolean isConnecting() {
        boolean z2;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z2 = true;
            if (i10 != 2 && i10 != 3) {
                z2 = false;
            }
        }
        return z2;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(nd.b bVar) {
        this.zzi = bVar.f12268b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i11, -1, new i0(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        p7.k kVar = (p7.k) eVar;
        ((com.google.android.gms.common.api.internal.g0) kVar.f12813b).F.G.post(new ah.d(kVar, 5));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i10));
    }

    public void triggerNotAvailable(d dVar, int i10, PendingIntent pendingIntent) {
        e0.j(dVar, "Connection progress callbacks cannot be null.");
        this.zzc = dVar;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i10, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i11, -1, new j0(this, i10)));
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
