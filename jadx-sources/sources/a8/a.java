package a8;

import android.content.Intent;
import android.content.IntentFilter;
import t7.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: i, reason: collision with root package name */
    public static final String f194i = m.l("BatteryChrgTracker");

    @Override // a8.f
    public final Object a() {
        Intent intentRegisterReceiver = this.f205b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            m.g().f(f194i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // a8.d
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // a8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L7
            goto L50
        L7:
            t7.m r0 = t7.m.g()
            java.lang.String r1 = "Received "
            java.lang.String r1 = r1.concat(r6)
            r2 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            java.lang.String r4 = a8.a.f194i
            r0.c(r4, r1, r3)
            int r0 = r6.hashCode()
            r1 = -1
            switch(r0) {
                case -1886648615: goto L44;
                case -54942926: goto L39;
                case 948344062: goto L2e;
                case 1019184907: goto L23;
                default: goto L21;
            }
        L21:
            r2 = r1
            goto L4d
        L23:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2c
            goto L21
        L2c:
            r2 = 3
            goto L4d
        L2e:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L37
            goto L21
        L37:
            r2 = 2
            goto L4d
        L39:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L42
            goto L21
        L42:
            r2 = 1
            goto L4d
        L44:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L4d
            goto L21
        L4d:
            switch(r2) {
                case 0: goto L63;
                case 1: goto L5d;
                case 2: goto L57;
                case 3: goto L51;
                default: goto L50;
            }
        L50:
            return
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            return
        L57:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            return
        L5d:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
            return
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.a.g(android.content.Intent):void");
    }
}
