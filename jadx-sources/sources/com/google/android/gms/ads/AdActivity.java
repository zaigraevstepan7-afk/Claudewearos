package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbto;
import nc.c;
import nc.p;
import nc.s;
import rc.k;
import xd.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public zzbto f3437a;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            zzbto zzbtoVar = this.f3437a;
            if (zzbtoVar != null) {
                zzbtoVar.zzh(i10, i11, intent);
            }
        } catch (Exception e10) {
            k.i("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbto zzbtoVar = this.f3437a;
            if (zzbtoVar != null) {
                if (!zzbtoVar.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            zzbto zzbtoVar2 = this.f3437a;
            if (zzbtoVar2 != null) {
                zzbtoVar2.zzi();
            }
        } catch (RemoteException e11) {
            k.i("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbto zzbtoVar = this.f3437a;
            if (zzbtoVar != null) {
                zzbtoVar.zzk(new b(configuration));
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k.b("AdActivity onCreate");
        p pVar = s.f12202f.f12204b;
        pVar.getClass();
        c cVar = new c(pVar, this);
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            k.d("useClientJar flag not found in activity intent extras.");
        }
        zzbto zzbtoVar = (zzbto) cVar.d(this, booleanExtra);
        this.f3437a = zzbtoVar;
        if (zzbtoVar == null) {
            k.i("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbtoVar.zzl(bundle);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        k.b("AdActivity onDestroy");
        try {
            zzbto zzbtoVar = this.f3437a;
            if (zzbtoVar != null) {
                zzbtoVar.zzm();
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        k.b("AdActivity onPause");
        try {
            zzbto zzbtoVar = this.f3437a;
            if (zzbtoVar != null) {
                zzbtoVar.zzo();
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            zzbto zzbtoVar = this.f3437a;
            if (zzbtoVar != null) {
                zzbtoVar.zzp(i10, strArr, iArr);
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        k.b("AdActivity onRestart");
        try {
            zzbto zzbtoVar = this.f3437a;
            if (zzbtoVar != null) {
                zzbtoVar.zzq();
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        k.b("AdActivity onResume");
        super.onResume();
        try {
            zzbto zzbtoVar = this.f3437a;
            if (zzbtoVar != null) {
                zzbtoVar.zzr();
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbto zzbtoVar = this.f3437a;
            if (zzbtoVar != null) {
                zzbtoVar.zzs(bundle);
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        k.b("AdActivity onStart");
        try {
            zzbto zzbtoVar = this.f3437a;
            if (zzbtoVar != null) {
                zzbtoVar.zzt();
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        k.b("AdActivity onStop");
        try {
            zzbto zzbtoVar = this.f3437a;
            if (zzbtoVar != null) {
                zzbtoVar.zzu();
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbto zzbtoVar = this.f3437a;
            if (zzbtoVar != null) {
                zzbtoVar.zzv();
            }
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        zzbto zzbtoVar = this.f3437a;
        if (zzbtoVar != null) {
            try {
                zzbtoVar.zzx();
            } catch (RemoteException e10) {
                k.i("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zzbto zzbtoVar = this.f3437a;
        if (zzbtoVar != null) {
            try {
                zzbtoVar.zzx();
            } catch (RemoteException e10) {
                k.i("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzbto zzbtoVar = this.f3437a;
        if (zzbtoVar != null) {
            try {
                zzbtoVar.zzx();
            } catch (RemoteException e10) {
                k.i("#007 Could not call remote method.", e10);
            }
        }
    }
}
