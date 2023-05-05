<template>

    <v-card outlined>
        <v-card-title>
            CreateClass
        </v-card-title>

        <v-card-text>
            <String label="ClassName" v-model="value.className" :editMode="editMode"/>
            <String label="ClassCode" v-model="value.classCode" :editMode="editMode"/>
            <Number label="ClassSize" v-model="value.classSize" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createClass"
            >
                CreateClass
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateClassCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.className = '';
            this.value.classCode = '';
            this.value.classSize = 0;
        },
        watch: {
        },
        methods: {
            createClass() {
                this.$emit('createClass', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

