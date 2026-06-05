package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final h f3563a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3564b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3565c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3566d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3567e;

    public n0(h hVar, int i10, a aVar, long j, long j4) {
        this.f3563a = hVar;
        this.f3564b = i10;
        this.f3565c = aVar;
        this.f3566d = j;
        this.f3567e = j4;
    }

    public static com.google.android.gms.common.internal.j a(g0 g0Var, com.google.android.gms.common.internal.f fVar, int i10) {
        com.google.android.gms.common.internal.j telemetryConfiguration = fVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.f3650b) {
            return null;
        }
        int[] iArr = telemetryConfiguration.f3652d;
        int i11 = 0;
        if (iArr != null) {
            while (i11 < iArr.length) {
                if (iArr[i11] != i10) {
                    i11++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.f3654f;
        if (iArr2 != null) {
            while (i11 < iArr2.length) {
                if (iArr2[i11] == i10) {
                    return null;
                }
                i11++;
            }
        }
        if (g0Var.E < telemetryConfiguration.f3653e) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j;
        long j4;
        h hVar = this.f3563a;
        if (hVar.c()) {
            com.google.android.gms.common.internal.t tVar = (com.google.android.gms.common.internal.t) com.google.android.gms.common.internal.s.b().f3703a;
            if (tVar == null || tVar.f3705b) {
                g0 g0Var = (g0) hVar.C.get(this.f3565c);
                if (g0Var != null) {
                    Object obj = g0Var.f3536b;
                    if (obj instanceof com.google.android.gms.common.internal.f) {
                        com.google.android.gms.common.internal.f fVar = (com.google.android.gms.common.internal.f) obj;
                        long j10 = this.f3566d;
                        boolean z2 = j10 > 0;
                        int gCoreServiceId = fVar.getGCoreServiceId();
                        if (tVar != null) {
                            z2 &= tVar.f3706c;
                            int i16 = tVar.f3707d;
                            int i17 = tVar.f3708e;
                            i10 = tVar.f3704a;
                            if (fVar.hasConnectionInfo() && !fVar.isConnecting()) {
                                com.google.android.gms.common.internal.j jVarA = a(g0Var, fVar, this.f3564b);
                                if (jVarA == null) {
                                    return;
                                }
                                boolean z10 = jVarA.f3651c && j10 > 0;
                                i17 = jVarA.f3653e;
                                z2 = z10;
                            }
                            i12 = i16;
                            i11 = i17;
                        } else {
                            i10 = 0;
                            i11 = 100;
                            i12 = 5000;
                        }
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i15 = 0;
                            i14 = 0;
                        } else if (task.isCanceled()) {
                            i14 = -1;
                            i15 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof com.google.android.gms.common.api.j) {
                                Status status = ((com.google.android.gms.common.api.j) exception).getStatus();
                                i13 = status.f3491a;
                                nd.b bVar = status.f3494d;
                                if (bVar != null) {
                                    i14 = bVar.f12268b;
                                }
                                i15 = i13;
                            } else {
                                i13 = 101;
                            }
                            i14 = -1;
                            i15 = i13;
                        }
                        if (z2) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f3567e);
                            j = j10;
                            j4 = jCurrentTimeMillis;
                        } else {
                            j = 0;
                            j4 = 0;
                        }
                        o0 o0Var = new o0(new com.google.android.gms.common.internal.r(this.f3564b, i15, i14, j, j4, null, null, gCoreServiceId, iElapsedRealtime), i10, i12, i11);
                        zau zauVar = hVar.G;
                        zauVar.sendMessage(zauVar.obtainMessage(18, o0Var));
                    }
                }
            }
        }
    }
}
