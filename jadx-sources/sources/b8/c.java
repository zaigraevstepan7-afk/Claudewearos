package b8;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import c8.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t.m1;
import t7.g;
import t7.m;
import u7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements y7.b, u7.a {
    public static final String C = m.l("SystemFgDispatcher");
    public final y7.c A;
    public SystemForegroundService B;

    /* renamed from: a, reason: collision with root package name */
    public final k f1615a;

    /* renamed from: b, reason: collision with root package name */
    public final f8.a f1616b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1617c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public String f1618d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1619e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f1620f;

    /* renamed from: z, reason: collision with root package name */
    public final HashSet f1621z;

    public c(Context context) {
        k kVarP0 = k.p0(context);
        this.f1615a = kVarP0;
        ac.d dVar = kVarP0.f16843e;
        this.f1616b = dVar;
        this.f1618d = null;
        this.f1619e = new LinkedHashMap();
        this.f1621z = new HashSet();
        this.f1620f = new HashMap();
        this.A = new y7.c(context, dVar, this);
        kVarP0.f16845g.a(this);
    }

    public static Intent a(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f16116a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f16117b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f16118c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f16116a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f16117b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f16118c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // u7.a
    public final void b(String str, boolean z2) {
        Map.Entry entry;
        synchronized (this.f1617c) {
            try {
                i iVar = (i) this.f1620f.remove(str);
                if (iVar != null ? this.f1621z.remove(iVar) : false) {
                    this.A.b(this.f1621z);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar = (g) this.f1619e.remove(str);
        if (str.equals(this.f1618d) && this.f1619e.size() > 0) {
            Iterator it = this.f1619e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f1618d = (String) entry.getKey();
            if (this.B != null) {
                g gVar2 = (g) entry.getValue();
                SystemForegroundService systemForegroundService = this.B;
                systemForegroundService.f1254b.post(new d(systemForegroundService, gVar2.f16116a, gVar2.f16118c, gVar2.f16117b));
                SystemForegroundService systemForegroundService2 = this.B;
                systemForegroundService2.f1254b.post(new f(gVar2.f16116a, 0, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.B;
        if (gVar == null || systemForegroundService3 == null) {
            return;
        }
        m mVarG = m.g();
        String str2 = C;
        int i10 = gVar.f16116a;
        int i11 = gVar.f16117b;
        StringBuilder sb2 = new StringBuilder("Removing Notification (id: ");
        sb2.append(i10);
        sb2.append(", workSpecId: ");
        sb2.append(str);
        sb2.append(" ,notificationType: ");
        mVarG.c(str2, m6.a.h(sb2, i11, ")"), new Throwable[0]);
        systemForegroundService3.f1254b.post(new f(gVar.f16116a, 0, systemForegroundService3));
    }

    public final void d(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        m mVarG = m.g();
        StringBuilder sb2 = new StringBuilder("Notifying with (id: ");
        sb2.append(intExtra);
        sb2.append(", workSpecId: ");
        sb2.append(stringExtra);
        sb2.append(", notificationType: ");
        mVarG.c(C, m6.a.h(sb2, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.B == null) {
            return;
        }
        g gVar = new g(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f1619e;
        linkedHashMap.put(stringExtra, gVar);
        if (TextUtils.isEmpty(this.f1618d)) {
            this.f1618d = stringExtra;
            SystemForegroundService systemForegroundService = this.B;
            systemForegroundService.f1254b.post(new d(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.B;
        systemForegroundService2.f1254b.post(new e(systemForegroundService2, intExtra, notification, 0));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= ((g) ((Map.Entry) it.next()).getValue()).f16117b;
        }
        g gVar2 = (g) linkedHashMap.get(this.f1618d);
        if (gVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.B;
            systemForegroundService3.f1254b.post(new d(systemForegroundService3, gVar2.f16116a, gVar2.f16118c, i10));
        }
    }

    @Override // y7.b
    public final void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            m.g().c(C, m1.i("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            k kVar = this.f1615a;
            kVar.f16843e.f(new d8.i(kVar, str, true));
        }
    }

    public final void g() {
        this.B = null;
        synchronized (this.f1617c) {
            this.A.c();
        }
        this.f1615a.f16845g.e(this);
    }

    @Override // y7.b
    public final void f(List list) {
    }
}
